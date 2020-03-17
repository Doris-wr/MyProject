package Operation;

import Conn.Mysql;
import table.Borrow;
import table.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BorrowBook extends Mysql implements IOperation {//借阅图书
    @Override
    public void work() {
        System.out.println("借阅书籍");
        System.out.println("请输入要借阅书籍的编号");
        int bno=scanner.nextInt();
        System.out.println("请输入您的id");
        int id=scanner.nextInt();
        System.out.println("请输入您的借阅时间");
        String borrowTime=scanner.next();
        System.out.println("请输入您的还书时间");
        String returnTime=scanner.next();



        Connection connection = null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        Borrow book=new Borrow(id,bno,borrowTime,returnTime);
        try {
            connection=getDataSource().getConnection();
            String sql1="select isBorrowed from book where bno=?";
            pstmt=connection.prepareStatement(sql1);
            pstmt.setInt(1,bno);

            String sql2 = "update Book set isBorrowed=true where bno=?";
            pstmt = connection.prepareStatement(sql2);
            pstmt.setInt(1, bno);
            pstmt.execute();

            String sql3 = "insert into  borrow values(?,?,?,?)";
            pstmt = connection.prepareStatement(sql3);
            pstmt.setInt(1, book.getBno());
            pstmt.setInt(2, book.getNo());
            pstmt.setString(3, book.getBorrowTime());
            pstmt.setString(4, book.getReturnTime());
            pstmt.execute();
            System.out.println("借阅成功！");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }

                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

