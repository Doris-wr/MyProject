package User;
import Operation.IOperation;

public abstract  class  User {
    protected String name;
    protected IOperation[] operations;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public abstract int menu();

    public void doOperation(int choice) {
        operations[choice].work();
    }
}



