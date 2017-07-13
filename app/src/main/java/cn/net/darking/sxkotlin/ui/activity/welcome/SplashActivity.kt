package cn.net.darking.sxkotlin.ui.activity.welcome

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.SystemClock
import cn.net.darking.sxkotlin.R
import cn.net.darking.sxkotlin.bean.app.AppBean
import cn.net.darking.sxkotlin.util.constant.ConstantSPKey
import cn.net.darking.sxkotlin.util.constant.ConstantSPName
import cn.net.darking.sxkotlin.util.constant.ConstantUrl
import cn.net.darking.sxkotlin.util.sp.SPUtil
import cn.net.darking.sxkotlin.util.xutil.HttpUtils
import org.xutils.http.RequestParams

class SplashActivity : Activity() {

    lateinit var sp: SPUtil
    lateinit var appBean :AppBean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        clearPushNum()


    }

    /**
     * 清除已缓存的推送数字信息
     */
    fun clearPushNum() {
        sp = SPUtil()
        /**顶部栏**/
        sp.setTrain(this, 0)
        sp.setKnowledge(this, 0)
        sp.setProposal(this, 0)
        sp.setBug(this, 0)
        sp.setCommunity(this, 0)

        sp.setScan(this, 0)
        sp.setShoot(this, 0)
        sp.setSignin(this, 0)
        sp.setPayment(this, 0)

        sp.setMessage(this, 0)
        sp.setTask(this, 0)
        sp.setCrm(this, 0)
        sp.setApprove(this, 0)

        sp.setMyself(this, 0)

        /**工作模块**/
        sp.setProject(this, 0)
        sp.setEngineering(this, 0)
        sp.setContract(this, 0)
        sp.setMarketchannel(this, 0)
        sp.setSalereport(this, 0)
        sp.setProjectstat(this, 0)
        sp.setEngineeringlog(this, 0)
        sp.setEmergency(this, 0)
        sp.setEngineeringeval(this, 0)
        sp.setConstruction(this, 0)
        sp.setConstructionteam(this, 0)
        sp.setWeekplan(this, 0)
        sp.setCompanyrun(this, 0)
        sp.setSitemsg(this, 0)

        /**顶部栏**/
        sp.setHome_zdlf(this, 0)
        sp.setWork_items(this, 0)
        sp.setKnowledge_zdlf(this, 0)
        sp.setCommunication_zdlf(this, 0)
        sp.setMine_zdlf(this, 0)


        //将所有的pushNum设置为0----比上面那一串爽多了
        //getSharedPreferences("pushNum", Context.MODE_PRIVATE).all   返回的是一个HashMap
        for ((key, value) in getSharedPreferences(ConstantSPName.PUSHNUM, Context.MODE_PRIVATE).all) {
            sp.setValueInt(this, ConstantSPName.PUSHNUM, "$key", 0)//名为pushNum的xml
        }

    }

    /**
     * 开发的时候用网络地址,发布版本后用本地文件
     */
    private fun getDataFromService() {


        val postUtils = HttpUtils()
        val url = ConstantUrl.API_BASE + "/apps/" + sp.getValueStr(this,ConstantSPName.USERCONFIG,ConstantSPKey.USER_KEY_APPID) + "/mobile.json"
        val initUrl = ConstantUrl.INIT_URL
        val params = RequestParams(initUrl)
        postUtils.GET(this, params)
        postUtils.OnCallBack(object : HttpUtils.OnSetData() {
            override fun onSuccess(strJson: String) {
                appBean = GsonUtil.getAppBean(strJson)
                SPUtil.setAppid(mActivity, appBean.appid)
                SPUtil.setSecret(mActivity, appBean.secret)
                SPUtil.setApiUpload(mActivity, appBean.api_upload)
                SPUtil.setApiAuth(mActivity, appBean.api_auth)
                SPUtil.setResetPasswordUrl(mActivity, appBean.login.passreset)
                SPUtil.setLogoutApi(mActivity, appBean.login.logoutapi)
                SPUtil.setApiUser(mActivity, appBean.api_user)
                SPUtil.setUser_ApiData(mActivity, appBean.api_data)


                //LogUtil.e("----######------getMobileJson-----====------" + strJson);
                SPUtil.setMobileJson(mActivity, strJson)

                if (appBean.authentication) {
                    initAppInfo()
                }


            }

            override fun onError(ex: Throwable, isOnCallback: Boolean) {
                MyToast.showLong(context, "请打开网络后重新启动程序！")
                SystemClock.sleep(2000)
                finish()
            }

            fun onCancelled(cex: Callback.CancelledException) {

            }

            fun onFinished() {

            }
        })
    }
}
