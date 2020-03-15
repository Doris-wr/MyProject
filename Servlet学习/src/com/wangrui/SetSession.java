package com.wangrui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:wangrui
 * @Date:2020/3/6 15:38
 */
@WebServlet("/set-session")
public class SetSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String now=format.format(date);
        String name=req.getParameter("name");
        if(name==null){
            name="wangrui";
        }
        HttpSession session=req.getSession();
        session.setAttribute("now",now);
        session.setAttribute("name",name);
        resp.setContentType("text/html;charset=utf-8 ");
        resp.getWriter().println("<h1>Session写入成功</h1>");

    }
}
