package Conn;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql {
    private final static String URL = "jdbc:mysql://localhost:3306/library?useSSL=false&useUnicode=true&characterEncoding=utf-8";
    private final static String USER = "root";
    private final static String PASSWORD = "";

    public static DataSource getDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        return dataSource;

    }

    public static int judge(int no) {//判断是否是用户
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            connection = getDataSource().getConnection();
            String sql = "select *from user where no=?";
            pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs!=null)
            return 1;
        return 0;
    }

}

