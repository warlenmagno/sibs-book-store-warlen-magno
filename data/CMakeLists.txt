# Setting required minimum version
cmake_minimum_required(VERSION 3.10.2)

project(sibs-book-store-app)

file(GLOB_RECURSE SOURCES src/*.cpp)
add_executable(sibs-native-lib ${SOURCES})

set(EXECUTABLE_OUTPUT_PATH "bin")

find_package(CURL)
if (CURL_FOUND)
    include_directories(${CURL_INCLUDE_DIRS})
    target_link_libraries(sibs-native-lib ${CURL_LIBRARIES})
else()
    MESSAGE(FATAL_ERROR "LibCurl is not found in your system.")
endif (CURL_FOUND)

target_link_libraries(sibs-native-lib ${LIBS} android log)