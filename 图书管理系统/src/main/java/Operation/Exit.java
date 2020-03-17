package Operation;

public class Exit implements IOperation{
    public void work() {
        System.out.println("byebye!");
        System.exit(0);
    }
}

