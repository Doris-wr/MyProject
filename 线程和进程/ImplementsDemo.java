package 线程和进程;
//问题描述：使用实现runnable方式来实现，三个同学吃50个苹果的比赛
//在使用实现方式的时候，我们发现ABC一共吃了50个苹果，为什么呢？
//因为三个线程共享了一个Apple对象，而一个Apple对象中共有50个苹果数量。
class Apple implements Runnable{
    private int num=50;//苹果的总数
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            if(num>0){
                //currentThread()方法--->获得当前线程的名称
                System.out.println(Thread.currentThread().getName()+"吃了编号为"+num-- +"的苹果");
            }
        }
    }
}
public class ImplementsDemo {
    public static void main(String[] args) {
        Apple a=new Apple();
//        三个线程共用同一个对象，创建三个线程（同学），吃苹果
        new Thread(a,"小A").start();
        new Thread(a,"小B").start();
        new Thread(a,"小C").start();
    }
}
