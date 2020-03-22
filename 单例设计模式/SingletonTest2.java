package 单例设计模式;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1=Order.getInstance();
        Order order2=Order.getInstance();
        System.out.println(order1==order2);
    }
}
//懒汉式单例模式（什么时候用什么时候造）
class Order{
    //1.私有化类的构造器
    private Order(){

    }
    //2.声明当前类对象，没有初始化
    private static Order instance=null;
    //3.声明一个公共的，静态的返回当前类对象的方法
    public static  Order getInstance(){
        if(instance==null){
            instance=new Order();
        }
        return instance;
    }
}