package 多线程.比特练习;
public class MyQueue2 {
    private int[] array = new int[2];
    private volatile int size;
    private int front;
    private int rear;
//两个等待集，保证生产者一定唤醒的是消费者，消费者一定唤醒的是生产者
    private Object full = new Object();
    private Object empty = new Object();

    public void put(int message) throws InterruptedException {
        do {
            while (size == array.length) {
                synchronized (full) {
                    full.wait();
                }
            }
            //这里保证size一定是<array.length的
            synchronized (this) {
                if(size==0){
                    continue;
                }
                array[rear] = message;
                rear = (rear + 1) % array.length;
                size++;
            }

            synchronized (empty) {
                empty.notify();
            }
        }while(true);
    }

    public synchronized int take() throws InterruptedException {
        while (size == 0) {
            synchronized (empty) {
                empty.wait();
            }
        }

        int message;
        synchronized (this) {
            message = array[front];
            front = (front + 1) % array.length;
            size--;
        }

        synchronized (full) {
            full.notify();
        }

        return message;
    }
}
