package cn.net.darking.sxkotlin.util.gson

import com.google.gson.Gson

/**
 * Created by Zrzc on 2017/7/13.
 */
class GsonUtil{
    private var gson: Gson? = null
    fun getGson(): Gson {
        if (gson == null) {
            gson = Gson()
        }
        return gson as Gson
    }

    /**
     * 总数据json
     * @param json
     * *
     * @return
     */
    fun getAppBean(json: String): T {
        return getGson().fromJson<T>(json, T::class.java!!)
        //        return datasBean;
    }
}