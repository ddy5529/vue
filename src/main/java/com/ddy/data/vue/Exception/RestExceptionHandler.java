package com.ddy.data.vue.Exception;

import net.sf.json.JSONObject;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestExceptionHandler {
    //参数类型不匹配
//getPropertyName()获取数据类型不匹配参数名称
//getRequiredType()实际要求客户端传递的数据类型
    @ExceptionHandler({TypeMismatchException.class})
    @ResponseBody
    public String requestTypeMismatch(TypeMismatchException ex){
        ex.printStackTrace();
        return outputJson(-400, "参数类型不匹配,参数" + ex.getPropertyName() + "类型应该为" + ex.getRequiredType());
    }

    //缺少参数异常
//getParameterName() 缺少的参数名称
    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseBody
    public String requestMissingServletRequest(MissingServletRequestParameterException ex){
        ex.printStackTrace();
        return outputJson(-400, "缺少必要参数,参数名称为" + ex.getParameterName());
    }


    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseBody
    public String HttpMessageNotReadableRequest(HttpMessageNotReadableException ex){
        ex.printStackTrace();
        return outputJson(-400, "缺少必要参数,参数名称为：" + ex.getLocalizedMessage()+"错误信息为："+ex.getMessage());
    }
    private String outputJson(int i, String s) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("key",i);
        jsonObject.put("errorinfo",s);
        return jsonObject.toString();
    }

}
