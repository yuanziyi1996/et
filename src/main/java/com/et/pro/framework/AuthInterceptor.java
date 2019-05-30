package com.et.pro.framework;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.et.pro.user.entity.User;

//定义拦截器
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (handler instanceof HandlerMethod) {
            System.out.print("获取uri  ");
            System.out.println(request.getRequestURL());

            if (request.getRequestURI().contains("/login") || request.getRequestURI().contains("/addUser")) {
                return true;
            }
            User u = (User) request.getSession().getAttribute("USER");
            if (u == null) {
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<script>");
                out.println("window.open ('login','_top');");//这里是用来重定向的 如果这里直接调用 login接口，那么
                //你是没有办法传入参数的。会报错
                out.println("</script>");
                out.println("</html>");
                return false;
            }
            // 判断后执行操作...
        }
        return true;
    }

}
