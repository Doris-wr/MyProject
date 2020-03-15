package com.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:wangrui
 * @Date:2020/3/6 18:16
 */
@WebServlet("/users/current")
//判断是否注册成功
public class CurrentUserServlet extends  HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session=req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null){
            resp.getWriter().println("<h1>用户没有登录</h1>");
        }else{
            PrintWriter out=resp.getWriter();
            out.println("<p>"+user.id+"</p>");
            out.println("<p>"+user.username+"</p>");
            out.println("<p>"+user.nickname+"</p>");
        }

    }
}
