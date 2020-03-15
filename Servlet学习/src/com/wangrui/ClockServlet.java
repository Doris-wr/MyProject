package com.wangrui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:wangrui
 * @Date:2020/3/5 16:24
 */
@WebServlet("/clock")
public class ClockServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setIntHeader("Refresh",1);
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now= format.format(date);
        System.out.println(now);
    }
}
