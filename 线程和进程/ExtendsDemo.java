package 线程和进程;
//问题描述：使用继承方法来实现三个同学吃50个苹果的比赛
//该方法解决问题时，会发现每个人都吃了50个苹果。原因是每创建一个person对象，在堆里都会开辟一个num为50的空间
//由此可知，继承方式不可实现多线程共享资源问题
class Person extends Thread{
    private int num=50;
    public Person(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            if(num>0){
                System.out.println(super.getName()+"吃了编号为"+  num-- +"的苹果");
            }
        }
    }
}
public class ExtendsDemo {
    public static void main(String[] args) {
        new Person("A").start();
        new Person("B").start();
        new Person("C").start();
    }
}
