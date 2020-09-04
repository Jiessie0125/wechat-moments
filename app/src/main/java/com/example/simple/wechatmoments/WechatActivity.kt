package com.example.simple.wechatmoments

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_wechat.*

class WechatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wechat)
        init()
    }

    override fun onStart() {
        super.onStart()
        this.window.apply {
            statusBarColor = Color.TRANSPARENT
            decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

    }

    private fun init(){
        wechatMomentsImageLayout.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            // if appBarLayout is collapsing
            if(Math.abs(verticalOffset) >= appBarLayout.getTotalScrollRange()){
                toolbar_view.title = resources.getString(R.string.wechat_moments)
            }else{
                collapsingToolbar.title = ""
            }
        }
    }
}
