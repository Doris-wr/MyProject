package com.wangrui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/3/3 14:07
 */
@WebServlet("/301")
public class Redirect301 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirect(resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirect(resp);
    }

    private void redirect(HttpServletResponse resp) {
        resp.setStatus(301);
        resp.setHeader("Location","/show-method");
    }
}
