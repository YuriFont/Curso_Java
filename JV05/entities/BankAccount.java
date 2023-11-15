package JV05.entities;

public class BankAccount
{
    final private int accountNumber;
    private String nameCardHolder;
    private double accountValue;
    public static final int rate = 5;

    public BankAccount(int accountNumber, String nameCardHolder, double accountValue)
    {
        this.accountNumber = accountNumber;
        this.nameCardHolder = nameCardHolder;
        this.accountValue = accountValue;
    }

    public String getNameCardholder()
    {
        return (nameCardHolder);
    }

    public void setCardHolder(String nameCardHolder)
    {
        this.nameCardHolder = nameCardHolder;
    }

    public double getAccountValue()
    {
        return (accountValue);
    }

    public void Deposit(double deposit)
    {
        accountValue += deposit;
    }

    public void Withdraw(double withdraw)
    {
        accountValue -= (withdraw + 5);
    }

    public String toString()
    {
        return ("Account " 
        + accountNumber 
        + ", Holder: " 
        + nameCardHolder 
        + ", Balance: $ " 
        + String.format("%.2f", accountValue));
    }
}
