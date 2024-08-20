package atm;

/**
 *
 * @author purvi
 */
interface ATM1
{
    void checkBalance();
    void withdraw(double amount);
    void deposit(double amount);

}
class BankAccount implements ATM1
{
    private double balance;
    public BankAccount()
    {
        this.balance = 0;
    }
    public void checkBalance() 
    {
        System.out.println("your current Balance is "+balance); 
    }

    public void withdraw(double amount)
    {
        if(amount <= balance) 
        {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
        } 
        else 
	{
            System.out.println("Insufficient balance");
        }
 
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("You have deposited :  "+amount);
    }
    
}
public class ATM 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      
        BankAccount atm = new BankAccount();
        atm.checkBalance();
        atm.deposit(5000);
        atm.checkBalance();
        atm.withdraw(1100);
        atm.checkBalance();
        
    }
    
}
