package v2.servlet;
import v2.Business.SessionServer;
import v2.Business.User;
import v2.Request;
import v2.Response;
import java.io.IOException;
public class HelloServlet extends HttpServlet{
    @Override
    public void doGet(Request req, Response resp) throws IOException {
        String sessionId=null;
        String cookie=req.headers.get("cookie");
        if(cookie!=null){
            sessionId=cookie.split("=")[1];
        }
        User user=SessionServer.get(sessionId);
        resp.setHeader("Content-type","application/javascript;charset=utf-8");
        resp.println("当前用户是"+user.username);
        resp.println("账户余额是"+user.balance);
    }
}
