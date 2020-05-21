package v2.servlet;
import v2.Business.SessionServer;
import v2.Business.User;
import v2.Request;
import v2.Response;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(Request req, Response resp) throws IOException {
        String username=req.parameters.get("username");
        if(username==null){
            resp.setStatus("401 Unauthorized");
            resp.setHeader("Content-type","text/html;charset=utf-8");
            resp.println("<h1>请登录<h1>");
            return;
        }
        User currentUser=User.findUser(username);
        if(currentUser==null){
            resp.setStatus("401 Unauthorized");
            resp.println("<h1>该用户不存在</h1>");
            return;
        }
        String sessionId=SessionServer.put(currentUser);
        resp.setHeader("Set-cookie","session-id="+sessionId+";expires=Tue,07-Apr-2020 08:46:16 GMT:Max-Age=8640000");
        resp.setHeader("Contend-Type","text/html;charset=utf-8");
        resp.print("<h1>欢迎"+username+"大驾光临<h1>");
    }
}
