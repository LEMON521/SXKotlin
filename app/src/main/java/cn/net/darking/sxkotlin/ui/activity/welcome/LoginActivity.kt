package cn.net.darking.sxkotlin.ui.activity.welcome

import android.os.Bundle
import cn.net.darking.sxkotlin.R
import cn.net.darking.sxkotlin.ui.activity.BaseActivity
import cn.net.darking.sxkotlin.ui.fragment.welcome.LoginFragment

class LoginActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)

        val bundle = Bundle()

        if (mAppBean.login == null) {
            mFragment = LoginFragment()
        } else if (mAppBean.login!!.loginurl == null) {
            mFragment = LoginFragment()

        } else if (mAppBean.login!!.loginurl.equals("")) {
            mFragment = LoginFragment()

        } else {
            bundle.putString("text", mAppBean.login!!.btntext)
            bundle.putString("url", mAppBean.login!!.loginurl)
            bundle.putString("tag", "login")
            //mFragment = WebViewFragment()
        }
        mFragment.arguments = bundle


        supportFragmentManager
                .beginTransaction()
                .replace(R.id.activity_empty_root, mFragment, "LOGIN")
                .commit()

    }
}

