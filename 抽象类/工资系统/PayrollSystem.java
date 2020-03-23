package 抽象类.工资系统;

import java.util.Scanner;

/*测试类
定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用
利用循环遍历数组元素，输出各个对象的类型，name，number，birthday
当键盘输入本月分值时，如果本月是某个Employee对象的生日，还要输出增加工资信息
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        System.out.println("请输入当前的月份");
        Employee[] emps=new Employee[2];
        emps[0]=new SalariedEmployee("马森",1002,new Mydate(1992,2,28),10000);
        emps[1]=new HourlyEmployee("潘裕生",2001,new Mydate(1991,1,6),60,240);
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary=emps[i].earning();
            System.out.println("月工资为"+salary);
            if(emps[i].getBirthday().getMonth()==month){
                System.out.println("生日快乐，奖励100元！");
            }
        }
    }
}
