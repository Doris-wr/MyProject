package v2.servlet;

import v2.Request;
import v2.Response;

import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) throws IOException {
        resp.setStatus("307 Temperary Redirect");
        resp.setHeader("Location","http://www.qq.com");
    }
}
