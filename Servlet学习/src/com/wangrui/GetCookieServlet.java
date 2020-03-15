package com.wangrui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/3/5 18:14
 */
@WebServlet("/get-cookie")
public class GetCookieServlet extends HttpServlet {
    private void printMessage(HttpServletResponse resp,String message) throws IOException {
        resp.getWriter().printf("<p>%s</p>");
        System.out.println(message);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String cookieValue=req.getHeader("Cookie");
         printMessage(resp,"渠道的Cookie Header是："+cookieValue);
    }
}
