package cn.net.darking.sxkotlin.ui.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import cn.net.darking.sxkotlin.bean.app.AppBean
import cn.net.darking.sxkotlin.ui.fragment.BaseFragment
import cn.net.darking.sxkotlin.util.constant.ConstantSPKey
import cn.net.darking.sxkotlin.util.constant.ConstantSPName
import cn.net.darking.sxkotlin.util.gson.GsonUtil
import cn.net.darking.sxkotlin.util.sp.SPUtil

open class BaseActivity : FragmentActivity() {

    public lateinit var mActivity: FragmentActivity
    public lateinit var mFragment: BaseFragment
    public lateinit var mAppBean: AppBean
    public lateinit var mSp : SPUtil
    public lateinit var mGson : GsonUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity =this
        mSp = SPUtil()
        mGson = GsonUtil()
        mAppBean = mGson.getJsonBean(mSp.getValueStr(mActivity, ConstantSPName.BEAN_JSON_MOBILE, ConstantSPKey.USER_KEY_USER_MOBILE))

    }
}
