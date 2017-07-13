package cn.net.darking.sxkotlin.util.sp

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by Zrzc on 2017/7/13.
 */
class SPUtil {

    private lateinit var editor: SharedPreferences.Editor


    private var sp: SharedPreferences? = null
    //    internal var editor: SharedPreferences.Editor
    private val PUSH_NUM = "pushNum"

    //==============================通用类型========================



    fun getValueInt(context: Context, name: String, key: String): Int {
        sp = context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sp!!.getInt(key, 0)
    }

    fun getValueState(context: Context, name: String, key: String): Boolean {
        sp = context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sp!!.getBoolean(key + "state", false)
    }

    fun setValueInt(context: Context, name: String, key: String, value: Int) {
        sp = context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt(key, value)
        //num>0有数据   num<0没有数据
        editor.putBoolean(key + "state", value > 0)
        editor.commit()
    }

    fun setValueStr(context: Context, name: String, key: String, value: String) {
        sp = context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putString(key, value)
        //num>0有数据   num<0没有数据
        editor.commit()
    }

    fun getValueStr(context: Context, name: String, key: String): String {
        sp = context.applicationContext.getSharedPreferences(name, Context.MODE_PRIVATE)
        return sp!!.getString(key, "")
    }

    //=========================直播===train=========================
    /**得到直播未读数量 */
    fun getTrain(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("train", 0)
    }

    /**得到直播未读数量 */
    fun getTrainState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("train_statey", false)
    }

    /**设置直播数量 */
    fun setTrain(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("train", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("train_state", num > 0)
        editor.commit()
    }


//=========================帮助===knowledge=========================
    /**得到帮助未读数量 */
    fun getKnowledge(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("knowledge", 0)
    }

    /**得到帮助未读数量 */
    fun getKnowledgeState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("knowledge_statey", false)
    }

    /**设置帮助数量 */
    fun setKnowledge(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("knowledge", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("knowledge_state", num > 0)
        editor.commit()
    }


//=========================建议===proposal=========================
    /**得到建议未读数量 */
    fun getProposal(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("proposal", 0)
    }

    /**得到建议未读数量 */
    fun getProposalState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("proposal_statey", false)
    }

    /**设置建议数量 */
    fun setProposal(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("proposal", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("proposal_statey", num > 0)
        editor.commit()
    }

//=========================报错===bug=========================
    /**得到报错未读数量 */
    fun getBug(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("bug", 0)
    }

    /**得到报错未读数量 */
    fun getBugState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("bug_statey", false)
    }

    /**设置报错数量 */
    fun setBug(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("bug", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("bug_statey", num > 0)
        editor.commit()
    }


//=========================社区===community=========================
    /**得到社区未读数量 */
    fun getCommunity(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("community", 0)
    }

    /**得到社区未读数量 */
    fun getCommunityState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("community_statey", false)
    }

    /**设置社区数量 */
    fun setCommunity(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("community", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("community_statey", num > 0)
        editor.commit()
    }


//=========================扫一扫===scan=========================
    /**得到扫一扫未读数量 */
    fun getScan(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("scan", 0)
    }

    /**得到扫一扫未读数量 */
    fun getScanState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("scan_statey", false)
    }

    /**设置扫一扫数量 */
    fun setScan(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("scan", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("scan_statey", num > 0)
        editor.commit()
    }

//=========================拍摄===shoot=========================
    /**得到拍摄未读数量 */
    fun getShoot(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("shoot", 0)
    }

    /**得到拍摄未读数量 */
    fun getShootState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("shoot_statey", false)
    }

    /**设置拍摄数量 */
    fun setShoot(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("shoot", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("shoot_statey", num > 0)
        editor.commit()
    }

//=========================签到===signin=========================
    /**得到签到未读数量 */
    fun getSignin(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("signin", 0)
    }

    /**得到签到未读数量 */
    fun getSigninState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("signin_statey", false)
    }

    /**设置签到数量 */
    fun setSignin(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("signin", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("signin_statey", num > 0)
        editor.commit()
    }


//=========================支付===payment=========================
    /**得到支付未读数量 */
    fun getPayment(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("payment", 0)
    }

    /**得到支付未读数量 */
    fun getPaymentState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("payment_statey", false)
    }

    /**设置支付数量 */
    fun setPayment(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("payment", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("payment_statey", num > 0)
        editor.commit()
    }


//=========================消息===message=========================
    /**得到消息未读数量 */
    fun getMessage(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("message", 0)
    }

    /**得到消息未读数量 */
    fun getMessageState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("message_statey", false)
    }

    /**设置消息数量 */
    fun setMessage(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("message", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("message_statey", num > 0)
        editor.commit()
    }


//=========================任务===task=========================
    /**得到任务未读数量 */
    fun getTask(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("task", 0)
    }

    /**得到任务未读数量 */
    fun getTaskState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("task_statey", false)
    }

    /**设置任务数量 */
    fun setTask(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("task", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("task_statey", num > 0)
        editor.commit()
    }


//=========================客户===crm=========================
    /**得到客户未读数量 */
    fun getCrm(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("crm", 0)
    }

    /**得到客户未读数量 */
    fun getCrmState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("crm_statey", false)
    }

    /**设置客户数量 */
    fun setCrm(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("crm", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("crm_statey", num > 0)
        editor.commit()
    }


//=========================审批===approve=========================
    /**得到审批未读数量 */
    fun getApprove(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("approve", 0)
    }

    /**得到审批未读数量 */
    fun getApproveState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("approve_statey", false)
    }

    /**设置审批数量 */
    fun setApprove(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("approve", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("approve_statey", num > 0)
        editor.commit()
    }


//=========================用户===myself=========================
    /**得到用户未读数量 */
    fun getMyself(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("myself", 0)
    }

    /**得到用户未读数量 */
    fun getMyselfState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("myself_statey", false)
    }

    /**设置用户数量 */
    fun setMyself(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("myself", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("myself_statey", num > 0)
        editor.commit()
    }


    //=========================项目管理===project=========================

    /**得到--项目管理--未读数量 */
    fun getProject(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("project", 0)
    }

    /**得到--项目管理--未读数量状态 */
    fun getProjectState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("project_statey", false)
    }

    /**设置--项目管理--数量 */
    fun setProject(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("project", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("project_statey", num > 0)
        editor.commit()
    }


    //=========================工程管理===engineering=========================

    /**得到--工程管理--未读数量 */
    fun getEngineering(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("engineering", 0)
    }

    /**得到--工程管理--未读数量状态 */
    fun getEngineeringState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("engineering_statey", false)
    }

    /**设置--工程管理--数量 */
    fun setEngineering(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("engineering", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("engineering_statey", num > 0)
        editor.commit()
    }


    //=========================合同管理===contract=========================

    /**得到--合同管理--未读数量 */
    fun getContract(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("contract", 0)
    }

    /**得到--合同管理--未读数量状态 */
    fun getContractState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("contract_statey", false)
    }

    /**设置--合同管理--数量 */
    fun setContract(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("contract", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("contract_statey", num > 0)
        editor.commit()
    }

    //=========================市场通道===marketchannel=========================

    /**得到--市场通道--未读数量 */
    fun getMarketchannel(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("marketchannel", 0)
    }

    /**得到--市场通道--未读数量状态 */
    fun getMarketchannelState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("marketchannel_statey", false)
    }

    /**设置--市场通道--数量 */
    fun setMarketchannel(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("marketchannel", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("marketchannel_statey", num > 0)
        editor.commit()
    }

    //=========================销售日报===salereport=========================

    /**得到--销售日报--未读数量 */
    fun getSalereport(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("salereport", 0)
    }

    /**得到--销售日报--未读数量状态 */
    fun getSalereportState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("salereport_statey", false)
    }

    /**设置--销售日报--数量 */
    fun setSalereport(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("salereport", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("salereport_statey", num > 0)
        editor.commit()
    }


    //=========================项目统计===projectstat=========================

    /**得到--项目统计--未读数量 */
    fun getProjectstat(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("projectstat", 0)
    }

    /**得到--项目统计--未读数量状态 */
    fun getProjectstatState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("projectstat_statey", false)
    }

    /**设置--项目统计--数量 */
    fun setProjectstat(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("projectstat", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("projectstat_statey", num > 0)
        editor.commit()
    }


    //=========================工程日志===engineeringlog=========================

    /**得到--工程日志--未读数量 */
    fun getEngineeringlog(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("engineeringlog", 0)
    }

    /**得到--工程日志--未读数量状态 */
    fun getEngineeringlogState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("engineeringlog_statey", false)
    }

    /**设置--工程日志--数量 */
    fun setEngineeringlog(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("engineeringlog", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("engineeringlog_statey", num > 0)
        editor.commit()
    }


    //=========================紧急情况===emergency=========================

    /**得到--紧急情况--未读数量 */
    fun getEmergency(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("emergency", 0)
    }

    /**得到--紧急情况--未读数量状态 */
    fun getEmergencyState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("emergency_statey", false)
    }

    /**设置--紧急情况--数量 */
    fun setEmergency(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("emergency", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("emergency_statey", num > 0)
        editor.commit()
    }


    //=========================工程评价===engineeringeval=========================

    /**得到--工程评价--未读数量 */
    fun getEngineeringeval(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("engineeringeval", 0)
    }

    /**得到--工程评价--未读数量状态 */
    fun getEngineeringevalState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("engineeringeval_statey", false)
    }

    /**设置--工程评价--数量 */
    fun setEngineeringeval(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("engineeringeval", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("engineeringeval_statey", num > 0)
        editor.commit()
    }

    //=========================施工能力===construction=========================

    /**得到--施工能力--未读数量 */
    fun getConstruction(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("construction", 0)
    }

    /**得到--施工能力--未读数量状态 */
    fun getConstructionState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("construction_statey", false)
    }

    /**设置--施工能力--数量 */
    fun setConstruction(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("construction", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("construction_statey", num > 0)
        editor.commit()
    }


    //=========================施工队===constructionteam=========================

    /**得到--施工队--未读数量 */
    fun getConstructionteam(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("constructionteam", 0)
    }

    /**得到--施工队--未读数量状态 */
    fun getConstructionteamState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("constructionteam_statey", false)
    }

    /**设置--施工队--数量 */
    fun setConstructionteam(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("constructionteam", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("constructionteam_statey", num > 0)
        editor.commit()
    }

    //=========================周计划===weekplan=========================

    /**得到--周计划--未读数量 */
    fun getWeekplan(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("weekplan", 0)
    }

    /**得到--周计划--未读数量状态 */
    fun getWeekplanState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("weekplan_statey", false)
    }

    /**设置--周计划--数量 */
    fun setWeekplan(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("weekplan", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("weekplan_statey", num > 0)
        editor.commit()
    }


    //=========================公司运营===companyrun=========================

    /**得到--公司运营--未读数量 */
    fun getCompanyrun(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("companyrun", 0)
    }

    /**得到--公司运营--未读数量状态 */
    fun getCompanyrunState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("companyrun_statey", false)
    }

    /**设置--公司运营--数量 */
    fun setCompanyrun(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("companyrun", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("companyrun_statey", num > 0)
        editor.commit()
    }

    //=========================站内信===sitemsg=========================

    /**得到--站内信--未读数量 */
    fun getSitemsg(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("sitemsg", 0)
    }

    /**得到--站内信--未读数量状态 */
    fun getSitemsgState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("sitemsg_statey", false)
    }

    /**设置--站内信--数量 */
    fun setSitemsg(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("sitemsg", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("sitemsg_statey", num > 0)
        editor.commit()
    }

    ////////////////////////////////bottombar////底部栏///////////////////////
    //=========================主页===home_zdlf=========================

    /**得到--主页--未读数量 */
    fun getHome_zdlf(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("home_zdlf", 0)
    }

    /**得到--主页--未读数量状态 */
    fun getHome_zdlfState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("home_zdlf_statey", false)
    }

    /**设置--主页--数量 */
    fun setHome_zdlf(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("home_zdlf", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("home_zdlf_statey", num > 0)
        editor.commit()
    }

    //=========================工作===work_items=========================

    /**得到--工作--未读数量 */
    fun getWork_items(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("work_items", 0)
    }

    /**得到--工作--未读数量状态 */
    fun getWork_itemsState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("work_items_statey", false)
    }

    /**设置--工作--数量 */
    fun setWork_items(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("work_items", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("work_items_statey", num > 0)
        editor.commit()
    }

    //=========================知识===knowledge_zdlf=========================

    /**得到--知识--未读数量 */
    fun getKnowledge_zdlf(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("knowledge_zdlf", 0)
    }

    /**得到--知识--未读数量状态 */
    fun getKnowledge_zdlfState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("knowledge_zdlf_statey", false)
    }

    /**设置--知识--数量 */
    fun setKnowledge_zdlf(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("knowledge_zdlf", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("knowledge_zdlf_statey", num > 0)
        editor.commit()
    }


    //=========================通讯===communication_zdlf=========================

    /**得到--通讯--未读数量 */
    fun getCommunication_zdlf(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("communication_zdlf", 0)
    }

    /**得到--通讯--未读数量状态 */
    fun getCommunication_zdlfState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("communication_zdlf_statey", false)
    }

    /**设置--通讯--数量 */
    fun setCommunication_zdlf(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("communication_zdlf", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("communication_zdlf_statey", num > 0)
        editor.commit()
    }


    //=========================我的===mine_zdlf=========================

    /**得到--我的--未读数量 */
    fun getMine_zdlf(context: Context): Int {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getInt("mine_zdlf", 0)
    }

    /**得到--我的--未读数量状态 */
    fun getMine_zdlfState(context: Context): Boolean {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        return sp!!.getBoolean("mine_zdlf_statey", false)
    }

    /**设置--我的--数量 */
    fun setMine_zdlf(context: Context, num: Int) {
        sp = context.applicationContext.getSharedPreferences(PUSH_NUM, Context.MODE_PRIVATE)
        editor = sp!!.edit()
        editor.putInt("mine_zdlf", num)
        //num>0有数据   num<0没有数据
        editor.putBoolean("mine_zdlf_statey", num > 0)
        editor.commit()
    }

}