package 抽象类.员工;

import 抽象类.员工.Employee;

public class
Manager extends Employee {
    private double bonus;//奖金
    public Manager(double bonus){
        super();
        this.bonus=bonus;
    }
    public Manager(String name,int id,double salary,double bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }
    @Override
    public void work() {
        System.out.println("管理员工，提供公司运行的效率");
    }
}
