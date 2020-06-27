/*
package 多线程;

public class ThreadDemo {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("我在method2 中打印");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedExcepction e){
                    e.printStackTrace();
                }
            }
        }
    }
    private static void method2(){
        Thread thread=new MyThread();
        thread.start();
    }

    public static void main(String[] args) throws InterruptedException{
        method2();
        while(true){
            System.out.println("我在卖弄中打印");
            Thread.sleep(1000);
        }
    }
}
*/
