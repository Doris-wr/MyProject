package v2;

import v2.servlet.*;
import javax.xml.ws.http.HTTPBinding;
import java.net.Socket;
public class Task implements Runnable {
    private Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 读取并解析请求 -> 处理业务 -> 组装并发送响应
            // 1. 读取并解析请求
            Request request = Request.parse(socket.getInputStream());
            System.out.println(request);
            Response response = new Response();
            // 2. 处理业务
            if (request.path.equals("/joke.js")) {
                HttpServlet servlet = new JokeJSServlet();
                servlet.doGet(request, response);
            }else if(request.path.equals("/hello")){
                HttpServlet servlet=new HelloServlet();
                servlet.doGet(request,response);
            }else if(request.path.equals("/跳转")){
                HttpServlet servlet=new RedirectServlet();
            }else if(request.path.equals("/plain")){
                HttpServlet servlet=new PlainTextServlet();
            }else if(request.path.equals("/run")){
               HttpServlet servlet=new RunServlet();
            }else if(request.path.equals("/login")){
                HttpServlet serclet=new LoginServlet();
            }else{
              //  HttpServlet servlet=new NotFounServlet();
            }
            // 3. 组装并发送响应
            response.writeAndFlush(socket.getOutputStream());
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
