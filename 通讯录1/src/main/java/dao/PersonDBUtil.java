package dao;

import 排序.NameComparator;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:wangrui
 * @Date:2020/5/28 16:25
 */
public class PersonDBUtil {
    //向通讯录中增加联系人
    public static void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name=scanner.nextLine();
        System.out.print("请输入年龄：");
        int age=scanner.nextInt();
        System.out.print("请输入电话号码：");
        int tel=scanner.nextInt();
        System.out.print("请输入地址：");
        scanner.nextLine();
        String addr= scanner.nextLine();
        Person person=new Person(name,age,tel,addr);
        PersonDao personDao=new PersonDao();
        try{
            personDao.insert(person);
            System.out.print("您所添加的联系人为：");
            System.out.println(person);
            System.out.println("添加成功！");
        }catch(Exception e){
            System.out.println("添加失败！");
        }finally{
            System.out.println("##########################################");
        }

    }
    //向通讯录中删除联系人
    public static void delete(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入您想要删除的联系人：");
        String name=scanner.nextLine();
        PersonDao personDao=new PersonDao();
        try{
            personDao.delete(name);
            System.out.println("删除成功！");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("删除失败!");
        }finally{
            System.out.println("##########################################");
        }
    }
    //更新联系人信息
    public static void update(String name){

    }
    //根据姓名查找联系人
    public static void searchOne(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入您所要查找的人的姓名：");
        String name=scanner.nextLine();
        PersonDao personDao=new PersonDao();
        try{
            personDao.searchOne(name);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("删除失败");
        }finally{
            System.out.println("##############################################");
        }
    }
    //查找所有联系人
    public static void searchAll(){
        PersonDao personDao=new PersonDao();
        try{
            personDao.searchAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("################################################");
        }
    }
    //根据姓名排序联系人
    public static void NameSort(){
        PersonDao personDao=new PersonDao();
        List list=personDao.searchAll();
        Person[] person=new Person[list.size()];
        list.toArray(person);
        NameComparator nameComparator=new NameComparator();
        Arrays.sort(person,nameComparator);
    }
}
