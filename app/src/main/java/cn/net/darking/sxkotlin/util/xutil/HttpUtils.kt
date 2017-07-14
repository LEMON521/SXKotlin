package cn.net.darking.sxkotlin.util.xutil

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.widget.Toast
import cn.net.darking.sxkotlin.ui.activity.welcome.SplashActivity
import cn.net.darking.sxkotlin.util.constant.ConstantSPKey
import cn.net.darking.sxkotlin.util.constant.ConstantSPName
import cn.net.darking.sxkotlin.util.constant.ConstantUrl
import cn.net.darking.sxkotlin.util.sp.SPUtil
import org.json.JSONException
import org.json.JSONObject
import org.xutils.common.Callback
import org.xutils.common.util.LogUtil
import org.xutils.http.RequestParams
import org.xutils.x

/**
 * Created by Zrzc on 2017/7/13.
 */
class HttpUtils (){

    private var mOnCallBack: OnSetData? = null
    private var mActivity: Context? = null
    private lateinit var sp: SPUtil

    private val callBack = object : Callback.CommonCallback<String> {
        override fun onSuccess(result: String) {

            //result = "{\"code\":1,\"data\":null,\"msg\":\"unauthorized\"}";
            try {
                val jsonObject = JSONObject(result)
                val code = jsonObject.optInt("code")
                if (code == 1) {//请求失败
                    if (jsonObject.optString("msg") == "unauthorized") {
                        LogUtil.e("code = 1------msg===" + (jsonObject.optString("msg") == "unauthorized"))
                        callBackUnauthorized(mActivity!!)
                    }

                } else if (code == 0) {
                    mOnCallBack!!.onSuccess(result)
                }


            } catch (e: JSONException) {
                e.printStackTrace()
            }


        }


        override fun onError(ex: Throwable, isOnCallback: Boolean) {
            mOnCallBack!!.onError(ex, isOnCallback)
        }

        override fun onCancelled(cex: Callback.CancelledException) {
            mOnCallBack!!.onCancelled(cex)
        }

        override fun onFinished() {
            mOnCallBack!!.onFinished()
        }
    }

    // 数据接口抽象方法
    interface OnSetData {
        //abstract ArrayList<KnowledgeBean.ItemsDataDao> cacheItemsDataList();

        fun onSuccess(strJson: String)

        fun onError(ex: Throwable, isOnCallback: Boolean)

        fun onCancelled(cex: Callback.CancelledException)

        fun onFinished()

    }

    // 数据接口设置,数据源接口传入
    fun OnCallBack(back: OnSetData) {
        mOnCallBack = back
    }


    /**
     * post请求
     */
    fun POST(activity: Context, params: RequestParams) {
        mActivity = activity
        sp = SPUtil()
        getParams(params)
        LogUtil.e("================params============" + params.toString())
        x.http().post(params, callBack)

    }

    /**
     * get请求
     */
    fun GET(activity: Context, params: RequestParams) {
        mActivity = activity
        sp = SPUtil()
        getParams(params)
        LogUtil.e("================params============" + params.toString())
        x.http().get(params, callBack)

    }

    /**
     * 每次请求
     */
    private fun getParams(params: RequestParams) {
        params.addBodyParameter(ConstantSPKey.USER_KEY_TOKEN, sp.getValueStr(mActivity!!, ConstantSPName.USERCONFIG, ConstantSPKey.USER_KEY_TOKEN).toString() + "")
        params.addBodyParameter(ConstantSPKey.USER_KEY_APPID, sp.getValueStr(mActivity!!, ConstantSPName.USERCONFIG, ConstantSPKey.USER_KEY_APPID).toString() + "")
        params.addBodyParameter(ConstantSPKey.USER_KEY_SECRET, sp.getValueStr(mActivity!!, ConstantSPName.USERCONFIG, ConstantSPKey.USER_KEY_SECRET).toString() + "")
    }


    private var dialog: AlertDialog? = null

    private fun callBackUnauthorized(activity: Context) {
        // mActivity = activity;
        if (dialog == null) {//防止创建多个dialog
            dialog = AlertDialog.Builder(activity).setTitle("友情提示").setMessage("该用户已被注销,点击确定重新登录")
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setPositiveButton("确定") { dialog, which ->
                        sp.setValueStr(activity, ConstantSPName.USERCONFIG, ConstantSPKey.UUID, "")
                        sp.setValueStr(activity, ConstantSPName.USERCONFIG, ConstantSPKey.USER_KEY_USERID, "")
                        sp.setValueStr(activity, ConstantSPName.USERCONFIG, ConstantSPKey.USER_KEY_TOKEN, "")
                        sp.setValueStr(activity, ConstantSPName.USERCONFIG, ConstantSPKey.AVATAR, "")
                        activity.startActivity(Intent(activity, SplashActivity::class.java))
//                        activity.finish();
                    }
                    .setNegativeButton("退出") { dialog, which ->
                        // 点击“返回”后的操作,这里不设置没有任何操作
                        //activity.finish();
                    }.show()
        }
    }

    /**
     * 获取全部联系人信息
     * @param context
     */
    fun getUserInfo(context: Context) {


        LogUtil.e("联系人信息---------字符串开始-------")
        val params = RequestParams(ConstantUrl.USERALL)
        x.http().get(params, object : Callback.CommonCallback<String> {
            override fun onSuccess(result: String) {
                var result = result
                result = "{\"users_all\":$result}"
                LogUtil.e("联系人信息---------字符串-------" + result)
                sp.setValueStr(context, ConstantSPName.USERADDRESS,ConstantSPKey.USER_KEY_USER_ADDRESS,result)
                LogUtil.e("联系人信息----------------" + sp.getValueStr(context,ConstantSPName.USERADDRESS,ConstantSPKey.USER_KEY_USER_ADDRESS))

            }

            override fun onError(ex: Throwable, isOnCallback: Boolean) {
                Toast.makeText(context,"获取联系人信息失败",Toast.LENGTH_SHORT)
                LogUtil.e("联系人信息---------字符串失败-------" + ex)
            }

            override fun onCancelled(cex: Callback.CancelledException) {

            }

            override fun onFinished() {}
        })

    }

}