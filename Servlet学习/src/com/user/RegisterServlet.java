package com.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

/**
 * @Author:wangrui
 * @Date:2020/3/6 16:18
 */
@WebServlet("/users/register")
//注册
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String username=req.getParameter("username");
        String nickname=req.getParameter("nickname");
        String password=req.getParameter("password");
        try(Connection con=DBUtil.getConnection()){
            String sql="insert into users(username,nickname,password)values(?,?,?)";
            try(PreparedStatement statement=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
                statement.setString(1,username);
                statement.setString(2,nickname);
                statement.setString(3,password);
                statement.executeUpdate();
                int id=-1;
                try(ResultSet rs=statement.getGeneratedKeys()){
                    rs.next();
                    //id是自增的，需要插入后才能获取
                    id=rs.getInt(1);
                }
                //注册成功
                //根据设计
                //1.注册成功就代表登录成功了，不需要用户重新登录了（选择之中）
                //2.注册成功后，需要用户继续登录
                //不需要用户登录，则需要写入session信息
                HttpSession session=req.getSession();
                User user=new User();
                user.id=id;
                user.username=username;
                user.nickname=nickname;
                //Servlet的session中，Value可以是任意类型的对象
                session.setAttribute("user",user);
                resp.getWriter().println("<h1>注册成功</h1>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resp.getWriter().println("<h1>注册失败</h1>");
        }
    }
}
