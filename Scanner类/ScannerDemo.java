package src.Scanner类;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名：");

        String name=scan.nextLine();
        System.out.println("请输入年龄：");
        int age=scan.nextInt();
        System.out.println("请输入身高");
        double height=scan.nextLong();
        scan.close();
    }
}
