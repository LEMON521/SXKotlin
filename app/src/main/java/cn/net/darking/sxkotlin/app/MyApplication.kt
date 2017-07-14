package cn.net.darking.sxkotlin.app

import android.app.Application

/**
 * Created by Zrzc on 2017/7/14.
 */
class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        //xutils3.0初始化
//        x.Ext.init(this)
//        x.Ext.setDebug(true) //输出debug日志，开启会影响性能
    }
}