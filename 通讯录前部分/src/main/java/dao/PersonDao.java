package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:wangrui
 * @Date:2020/5/28 12:00
 */
public class PersonDao {
    //向数据库中添加联系人insert
    public void  insert(Person person){
        Connection connection=DBUtil.getConnection();
        PreparedStatement preparedStatement=null;
        String sql="insert into contact_table values(?,?,?,?)";
        try {
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,person.getName());
            preparedStatement.setInt(2,person.getAge());
            preparedStatement.setInt(3,person.getTel());
            preparedStatement.setString(4,person.getAddr());
            int ret = preparedStatement.executeUpdate();
            if(ret!=1){
                System.out.println("程序出现异常！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(connection,preparedStatement,null);
        }
    }
    //从数据库中删除联系人delete
    public void delete(String name) throws SQLException {
        Connection connection=DBUtil.getConnection();
        String sql="delete from contact_table where name=?";
        PreparedStatement statement= null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            int ret=statement.executeUpdate();
            if(ret!=1){
                System.out.println("删除异常");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,null);
        }
    }
    //修改数据库中的联系人信息
    public void update(Person person){
        Connection connection=DBUtil.getConnection();
        String sql="update from contact_table where name=?";
        try {
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,person.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //根据姓名查找联系人
    public Person searchOne(String name){
        Connection connection=DBUtil.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        String sql="select* from contact_table where name=?";
        try {
            statement=connection.prepareStatement(sql);
            statement.setString(1,name);
            resultSet=statement.executeQuery();
            if(resultSet.next()){
                Person person=new Person();
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setTel(resultSet.getInt("tel"));
                person.setAddr(resultSet.getString("addr"));
                System.out.println(person);;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }
    //查找所有联系人
    public List<Person> searchAll(){
        Connection connection=DBUtil.getConnection();
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        String sql="select* from contact_table";
        try {
            List list=new ArrayList();
            statement=connection.prepareStatement(sql);
            resultSet=statement.executeQuery();
            while(resultSet.next()){
                Person person=new Person();
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setTel(resultSet.getInt("tel"));
                person.setAddr(resultSet.getString("addr"));
                list.add(person);
                System.out.println();
            }
            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(connection,statement,resultSet);
        }
        return null;
    }

}
