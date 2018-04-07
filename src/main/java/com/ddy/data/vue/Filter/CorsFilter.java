package com.ddy.data.vue.Filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@Component
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request=(HttpServletRequest)req;
        String requestMethod= request.getMethod().trim();

        response.setHeader("Access-Control-Allow-Credentials","true");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET,HEAD,PUT,POST,DELETE,PATCH");
        response.setHeader("Access-Control-Max-Age", "2592000");
        response.setHeader("Connection","keep-alive");
        if ("OPTIONS".equals(requestMethod)) {
            response.setStatus(204);
//            response.setHeader("Date","");
            String uri=request.getRequestURI().toString().trim();
            if (Pattern.matches(".*/user/login", uri)){
                response.setHeader("Access-Control-Allow-Headers", "content-type");
            }else if (Pattern.matches(".*/user/info.*", uri)){
                response.setHeader("Access-Control-Allow-Headers", "x-token");
            }else if (Pattern.matches(".*/user/logout.*", uri)){
                response.setHeader("Access-Control-Allow-Headers", "x-token");
                response.setHeader("Content-Type","application/json; charset=utf-8");
                response.setHeader("Rate-Limit-Remaining","1");
                response.setHeader("Rate-Limit-Reset","1521558246");
                response.setHeader("Rate-Limit-Total","2");
                response.setHeader("Server","Tengine");
                response.setHeader("Vary","Accept, Origin");
                response.setHeader("X-Request-Id","612b2240-44c1-417e-afbe-47c585efbaf6");
            }

        }

        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }
}