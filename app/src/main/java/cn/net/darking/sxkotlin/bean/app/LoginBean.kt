package cn.net.darking.sxkotlin.bean.app

/**
 * Created by Zrzc on 2017/7/13.
 */
class LoginBean{
    var background = ""
    var btntext = ""
    var canregister = false
    var ismember = false
    var loginapi = ""
    var loginurl = ""
    var logoutapi = ""
    var passreset = ""
    var resetpassword = false

    var mobilecheck = ""//为1就是启用手机验证码验证，否则不启用
    var registerapi = ""//注册提交的url
    var serviceurl = ""//服务协议查看网页地址，如果为空就不显示链接
    var privateurl = ""//隐私条款查看网页地址，如果为空就不现实链接
    //    serviceurl与privateurl都为空，整个这一个区域都不显示

}