package com.ddy.data.vue.Utils.checkString;

import net.sf.json.JSONObject;

import java.util.Map;

public class JsonUtils {
    private static JSONObject jsonObject=null;
    public static String MapToJsonString(Map map ){
        jsonObject=JSONObject.fromObject(map);
        return jsonObject.toString();
    }
}
