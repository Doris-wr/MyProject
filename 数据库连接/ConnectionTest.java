package 数据库连接;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//连接数据库的几种方式
/**
 * @Author:wangrui
 * @Date:2020/3/13 23:21
 */
public class ConnectionTest {
    @Test
    //方式一
    public void testConnection() throws SQLException {
        Driver driver=new com.mysql.jdbc.Driver();
        //jdbc:mysql:协议
        //localhost：ip地址
        //3306：默认mysql的端口号
        //java11：数据库名
        String url = "jdbc:mysql://localhost:3306/java11";
        //将用户名和密码封装在Properties中
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","");
        Connection con=driver.connect(url,info);
        System.out.println(con);
    }
    //对方式一的迭代:目的——使得在如下的程序中不出现第三方的API，使得程序具有更好的可移植性
    @Test
    public void testConnection2() throws Exception {
        //1.获取Driver实现类对象，使用反射
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        Driver driver=(Driver)clazz.newInstance();
        //提供要连接的数据库
        String url="jdbc:mysql://localhost:3306/=java11";
        //3.提供连接需要的用户名和密码
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","");
        //4.获取连接
        Connection connection=driver.connect(url,info);
        System.out.println(connection);
    }
    //方式三：对方式二的迭代
    @Test
    public void testConnection3( ) throws Exception{
        //1.获取Driver实现类对象，使用反射
        Class clazz=Class.forName("com.mysql.jdbc.Driver");
        Driver driver=(Driver)clazz.newInstance();
        //2.提供另外三个连接的基本信息
        String url="jdbc:mysql://localhost:3306/java11";
        String user="root";
        String password="";
        //3.注册驱动
        DriverManager.registerDriver(driver);
        //4.获取连接
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println(con);
    }
    //方式四：对的方式三的优化(记第四种)
    @Test
    public void testConnection4() throws Exception{
        //1.提供三个连接的基本信息
        String url="jdbc:mysql://localhost:3306/java11";
        String user="root";
        String password="";
        //2.加载Driver
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取连接
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println(con);
    }
    //方式五：最终板,将数据库连接需要的四个基本信息声明在配置文件中，通过读取配置文件的方式获取连接
    //好处： ① 实现了数据与代码的分离，实现了解耦
    //       ②如果需要修改你配置文件信息，可以避免程序重新打包
    @Test
    public void testConnection5() throws IOException, ClassNotFoundException, SQLException {
        //1.读取配置文件中的四个基本信息
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);
        String user=pros.getProperty("user");
        String password=pros.getProperty("password");
        String url=pros.getProperty("url");
        String driverClass=pros.getProperty("driverClass");
        //2.加载驱动
        Class.forName(driverClass);
        //3.获取连接
        Connection con=DriverManager.getConnection(url,user,password);
        System.out.println(con);
    }
}
