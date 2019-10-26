package com.chinasofti.postbar.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.chinasofti.postbar.utils.Result;
import com.chinasofti.postbar.utils.TokenUtil;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        String curOrigin = request.getHeader("Origin");
        response.setCharacterEncoding("utf-8");
        //跨域ajax请求，都会先发一次method为OPTIONS的预请求
        //1、获取服务器支持的HTTP请求方法。
        //2、用来检查服务器的性能。例如：AJAX进行跨域请求时的预检，需要向另外一个域名的资源发送一个HTTP OPTIONS请求头，用以判断实际发送的请求是否安全。
        if (request.getMethod().equals("OPTIONS")){
            System.out.println("OPTIONS");
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }
        if(null != token){
            if(TokenUtil.verify(token)){
                return true;
            }
        }
        setCorsMappings(request,response);
        Result result = Result.err("用户过期，请重新登录");
        String json = JSONObject.toJSONString(result);
        response.getWriter().write(json);
        return false;
    }
    // 在拦截器中设置跨域
    private void setCorsMappings(HttpServletRequest request, HttpServletResponse response) {
        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
    }
}
