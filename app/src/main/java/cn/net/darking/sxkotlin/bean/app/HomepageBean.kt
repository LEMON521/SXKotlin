package cn.net.darking.sxkotlin.bean.app

import java.util.*
import java.util.Map

/**
 * Created by Zrzc on 2017/7/13.
 */
class HomepageBean{
    private var sb: StringBuilder? = null


    var icon = ""
    var icon_default = ""
    var icon_position = ""
    var icon_selected = ""
    var linkto = ""
    var member = 0
    var selected = 0
    var tag = ""
    var text = ""
    var title = ""
    var url = ""
    var visitor = 0
    var tag_params: HashMap<String, String>? = null

    override fun toString(): String {
        if (sb == null) {
            sb = StringBuilder()
        } else if (sb!!.length > 0) {
            sb!!.setLength(0)
        }

        sb!!.append("{")

        sb!!.append("\"icon\":\"")
        sb!!.append(icon)
        sb!!.append("\",")

        sb!!.append("\"icon_default\":\"")
        sb!!.append(icon_default)
        sb!!.append("\",")

        sb!!.append("\"icon_position\":\"")
        sb!!.append(icon_position)
        sb!!.append("\",")

        sb!!.append("\"icon_selected\":\"")
        sb!!.append(icon_selected)
        sb!!.append("\",")

        sb!!.append("\"linkto\":\"")
        sb!!.append(linkto)
        sb!!.append("\",")

        sb!!.append("\"member\":")
        sb!!.append(member)
        sb!!.append(",")

        sb!!.append("\"selected\":")
        sb!!.append(selected)
        sb!!.append(",")

        sb!!.append("\"tag\":\"")
        sb!!.append(tag)
        sb!!.append("\",")

        sb!!.append("\"text\":\"")
        sb!!.append(text)
        sb!!.append("\",")

        sb!!.append("\"title\":\"")
        sb!!.append(title)
        sb!!.append("\",")

        sb!!.append("\"url\":\"")
        sb!!.append(url)
        sb!!.append("\",")

        sb!!.append("\"visitor\":")
        sb!!.append(visitor)
        sb!!.append("")

        if (tag_params != null) {
            sb!!.append(",{")

            val iterator = tag_params!!.entries.iterator()
            while (iterator.hasNext()) {

                val entry = iterator.next() as Map.Entry<String, String>
                val key = entry.key as String
                val value = entry.value as String
                sb!!.append("\"")
                sb!!.append(key)
                sb!!.append("\":\"")
                sb!!.append(value)
                sb!!.append("\"")
                if (iterator.hasNext()) {
                    sb!!.append(",")
                }

            }

            sb!!.append("}")
        }


        sb!!.append("}")

        return sb!!.toString()
    }


}