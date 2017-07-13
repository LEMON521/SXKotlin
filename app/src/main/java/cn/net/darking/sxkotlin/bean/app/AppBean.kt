package cn.net.darking.sxkotlin.bean.app

import java.io.Serializable
import java.util.ArrayList

/**
 * Created by Zrzc on 2017/7/13.
 */
class AppBean : Serializable {
    var api_data = ""
    var api_auth = ""
    var api_open = ""
    var api_upload = ""//上传文件的绝对url
    var api_user = ""
    var appid = ""
    var authentication = true
    var description = ""
    var homepage: ArrayList<HomepageBean>? = null
    var id = ""
    var loaders: ArrayList<LoadersBean>? = null
    var login: LoginBean? = null
    var logo = ""
    var modules: ModulesBean? = null
    var position = ""
    var push: AppPushBean? = null
    var pushdata: PushdataBean? = null
    var pushkeys: PushkeysBean? = null
    var secret = ""
    var title = ""
    var toolbar: ToolbarBean? = null
}