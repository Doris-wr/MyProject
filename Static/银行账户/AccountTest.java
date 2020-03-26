package Static.银行账户;

public class AccountTest {
    public static void main(String[] args) {
        Accout acct1=new Accout();
        Accout acct2=new Accout("qwery",2000);
        Accout.setInteredstRate(0.012);
        Accout.setMinMoney(100);
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct1.getInteredstRate());
        System.out.println(acct1.getMinMoney());
    }
}
