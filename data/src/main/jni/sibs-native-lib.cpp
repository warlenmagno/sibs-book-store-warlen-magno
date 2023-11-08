// O código inclui as bibliotecas necessárias para JNI (jni.h), manipulação de strings (string),
// e chamadas HTTP usando libcurl (curl/curl.h)
#include <jni.h>
#include <string>
#include <curl/curl.h>

//Esta é a função JNI que será chamada a partir do código Kotlin/Java. Ela recebe um inteiro page
// como argumento e retorna uma string Java.
extern "C" JNIEXPORT jstring JNICALL
Java_com_sibsBookStore_data_jni_SibsAPI_searchBooks(JNIEnv *env, jobject thiz, jint page) {
    CURL *curl;
    CURLcode res;
    std::string response;

    // URL da API do Google Books é construída com base no valor do parâmetro page.
    // Esta URL será usada para fazer a chamada HTTP.
    std::string url = "https://www.googleapis.com/books/v1/volumes?q=ios&maxResults=20&startIndex=" + std::to_string(page);

    // Inicializa o libcurl e configura a URL para a chamada HTTP.
    curl_global_init(CURL_GLOBAL_DEFAULT);
    curl = curl_easy_init();

    if(curl) {
        curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
        curl_easy_setopt(curl, CURLOPT_FOLLOWLOCATION, 1L);

        // Uma estrutura MemoryStruct para armazenar os dados recebidos durante a chamada HTTP.
        struct MemoryStruct {
            char *memory;
            size_t size;
        };

        MemoryStruct chunk;
        chunk.memory = (char*)malloc(1); //Será aumentado conforme necessário pela chamada realloc
        chunk.size = 0;                   // Não há dados neste momento

        // É configurado um callback personalizado para tratar os dados recebidos durante a chamada HTTP.
        // O callback aloca memória dinamicamente para armazenar os dados recebidos.
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, [](char* ptr, size_t size, size_t nmemb, MemoryStruct* mem) -> size_t {
            size_t realsize = size * nmemb;
            mem->memory = (char*)realloc(mem->memory, mem->size + realsize + 1);
            if (mem->memory == NULL) {
                // // Fora da memória!
                return 0;
            }
            memcpy(&(mem->memory[mem->size]), ptr, realsize);
            mem->size += realsize;
            mem->memory[mem->size] = 0;
            return realsize;
        });
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, (void *)&chunk);

        // A chamada HTTP é realizada e os dados de resposta são armazenados na variável response
        // se a operação for bem-sucedida.
        res = curl_easy_perform(curl);
        if(res == CURLE_OK) {
            response = chunk.memory;
        }

        // Após o término da chamada HTTP, a memória alocada dinamicamente é liberada e os recursos
        // do libcurl são limpos.
        free(chunk.memory);
        curl_easy_cleanup(curl);
    }

    curl_global_cleanup();

    // A resposta obtida é retornada como uma string Kotlin/Java UTF-8.
    return env->NewStringUTF(response.c_str());
}