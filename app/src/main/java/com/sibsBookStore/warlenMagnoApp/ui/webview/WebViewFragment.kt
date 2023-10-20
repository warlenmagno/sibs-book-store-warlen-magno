package com.sibsBookStore.warlenMagnoApp.ui.webview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.databinding.DataBindingUtil
import com.sibsBookStore.warlenMagnoApp.R
import com.sibsBookStore.warlenMagnoApp.databinding.FragmentWebViewBinding
import com.sibsBookStore.warlenMagnoApp.util.AppConstants

class WebViewFragment : Fragment() {

    lateinit var mBinding: FragmentWebViewBinding
    lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        url = arguments?.getString(AppConstants.URL_ARGU)!!

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_web_view, container, false)
        openUrl()
        return mBinding.root
    }
    private fun openUrl(){
        //TODO this can be improved more
        val webSettings: WebSettings = mBinding.webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mBinding.webview.loadUrl(url)
    }

}