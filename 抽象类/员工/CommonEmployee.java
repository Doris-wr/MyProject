package 抽象类.员工;

public class CommonEmployee extends Employee {

    @Override
    public void work() {
        System.out.println("员工在一线车间生产产品");
    }
}
