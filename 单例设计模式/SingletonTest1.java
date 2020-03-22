package 单例设计模式;

import 小项目.模拟银行.Bank;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank1 bank1=Bank1.getInstance();
        Bank1 bank2=Bank1.getInstance();
        System.out.println(bank1==bank2);
    }
}
//饿汉式单例模式（一上来就造好对象）
class Bank1{
    //1.私有化类的构造器
    private Bank1(){
    }
    //2内部创建类的对象
    //4要求此对象也必须声明为静态的
    private static Bank1 instance=new Bank1();
    //3.提供公共的静态方法返回类的对象
    public static Bank1 getInstance(){
        return instance;
    }
}
