package v2.servlet;

import v2.Request;
import v2.Response;

import java.io.IOException;

public class PlainTextServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) throws IOException {
        //resp.setStatus("contend-Type","text/plain;charset=utf-8");
        resp.println("<h1>我不是html元素</h1>");
    }
}
