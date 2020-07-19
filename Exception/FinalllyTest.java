package 异常.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinalllyTest {
    public static int test(){
        try {
            int[] arr=new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println("我一定会被执行");
        }
    }
    public static void main2(String[] args) {
        int num=test();
        System.out.println(num);
    }
    public static void main(String[] args) {
            FileInputStream fis=null;
            try {
                File file = new File("hello.txt");
                fis=new FileInputStream(file);
                int data = fis.read();
                while (data != -1) {
                    System.out.println((char) data);
                    data = fis.read();
                }
            }catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally{
                try {
                    if(fis!=null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
    public static void main1(String[] args) {
            try {
                int a=10;
                int b=0;
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                int[] arr=new int[10];
                System.out.println(arr[10]);
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                System.out.println("我好帅啊");
            }
    }
}
