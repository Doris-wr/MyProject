package 抽象类.工资系统;
/*
定义SalariedEmplyee类继承Employee类
实现按月计算工资的员工处理，该类包括，private成员变量monthlySalary
实现父类的抽象方法earning（），该方法返回monthlySalary值
toString（）方法输出员工类信息及员工的name，number，birthday
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;
    public SalariedEmployee(String name,int number,Mydate birthday){
        super(name,number,birthday);
    }
    public SalariedEmployee(String name,int number,Mydate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary=monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earning() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalaryEmployee["+super.toString()+"]";
    }
}
