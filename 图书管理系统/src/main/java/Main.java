import Conn.Mysql;
import User.*;
import java.util.Scanner;
public class Main {
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入身份:0.管理员  1.用户");
            int chioce=scanner.nextInt();
            System.out.println("请输入id");
            int id=scanner.nextInt();
            System.out.println("请输入名字");
            String name=scanner.next();
            if(chioce==1) {
                if(Mysql.judge(id)==1){
                    User user=new NormalUser(name);
                    return user;
                }
                System.out.println("id错误");
            }else {
                User user = new Admin(name);
                return user;
            }
        }

    }
    public static void main(String[] args) {
        User user=login();
        while(true){
            int chioce=user.menu();
            user.doOperation(chioce);
        }
    }
}

