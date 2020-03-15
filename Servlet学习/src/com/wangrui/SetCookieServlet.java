package com.wangrui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/3/5 17:46
 */
@WebServlet("/set-cookie")
public class SetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        {
            Cookie cookie=new Cookie("name","wangrui ");
            resp.addCookie(cookie);
        }
        {
            Cookie cookie = new Cookie("age", "18");
            cookie.setMaxAge(10 * 60);
            resp.addCookie(cookie);
        }
        resp.getWriter().println("<h1>手写Header 来种Cookie</h1>");
    }
}
