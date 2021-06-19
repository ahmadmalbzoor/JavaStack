public class mainTester{
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        
        System.out.println(b.deposit(100));
        BankAccount a=new BankAccount();
        System.out.println(a.deposit(100));

        BankAccount c=new BankAccount();
        c.deposit(1000);
        double x=c.withdrawAmount(400);
        System.out.println(x);
        
        c.depositCheck(1000);
        c.totalMoney();
        System.out.println(c.totalMoney());
    }
}