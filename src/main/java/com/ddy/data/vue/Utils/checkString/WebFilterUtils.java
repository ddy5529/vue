package com.ddy.data.vue.Utils.checkString;

import java.util.regex.Pattern;

public class WebFilterUtils {
    public static boolean needXtoken(String uri){
        StringBuffer sbf =new StringBuffer();
        sbf.append(".*/user/info.*");
        sbf.append(",");
        sbf.append(".*/index.*");
        sbf.append(",");

        for (String str :sbf.toString().split(",")) {
            if (Pattern.matches(str, uri)){
                return true;
            }
        }
        return false;
    }
}
