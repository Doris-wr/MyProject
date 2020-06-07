import dao.Person;
import dao.PersonDao;
import java.util.Scanner;

import static dao.PersonDBUtil.*;
import static fun.Function.menu;
import static fun.Function.menu2;

/**
 * @Author:wangrui
 * @Date:2020/5/28 12:01
*/
public class Main {
    public static void main(String[] args) {
        while(true){
            menu();
            Scanner scanner=new Scanner(System.in);
            System.out.print("请输入你的选择：");
            int n=scanner.nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    System.out.println("修改");
                    break;
                case 4:
                        menu2();
                        System.out.print("请选择您要查询的具体内容：");
                        int s = scanner.nextInt();
                        switch (s) {
                            case 1:
                                searchOne();
                                break;
                            case 2:
                                searchAll();
                                break;
                            default:
                                System.out.println("您输入的不正确，请重新输入！");
                        }
                case 5:
                    NameSort();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }
}
