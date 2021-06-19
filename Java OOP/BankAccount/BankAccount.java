public class BankAccount{
    private String accountNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    static double count=0;
    public double moneyStored=0;
    public double withdraw;
    public double totalM;
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    
    public void setCheckingBalance(double checkingBalance)
    {
        this.checkingBalance=checkingBalance;
    }
    public double getCheckingBalance()
    {
        return this.checkingBalance;
    }
    
    public void setSavingBalance(double savingBalance)
    {
        this.savingBalance=savingBalance;
    }
    public double getSavingBalance()
    {
        return this.savingBalance;
    }
    
    private String accountId()
    {
        long min=999999999;
        long max=1999999999;
        long random_int = (long)Math.floor(Math.random()*(max-min+1)+min);
        String s=String.valueOf(random_int);  
        return s;
    }
    public BankAccount(){
          this.accountNumber=accountId();
          count++;
    }
    public double deposit(double savingBalance)
    {
        this.savingBalance+=savingBalance;
        this.moneyStored+=savingBalance;
        return moneyStored;
    }
    public double depositCheck(double checkingBalance)
    {
        this.checkingBalance+=checkingBalance;
        this.moneyStored+=checkingBalance;
        return checkingBalance;
    }
    public double withdrawAmount(double withdraw)
    {     if(withdraw<savingBalance)
        {
          this.savingBalance-=withdraw;
          this.moneyStored=-withdraw;
          System.out.println(savingBalance);
          return savingBalance;
        }else{
              System.out.println("You don't have insefutiont funds");
             }
        return moneyStored;
    }

    public double totalMoney()
    {
        return this.checkingBalance+this.savingBalance;
        
    }
}