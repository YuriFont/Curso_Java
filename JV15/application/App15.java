package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class App15
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account a = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            Double withdraw = sc.nextDouble();
            a.withdraw(withdraw);
            System.out.printf("New balance: %.2f\n", a.getBalance());
        }
        catch (DomainException e)
        {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }    
}
