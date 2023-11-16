package JV05.application;

import java.util.Scanner;

import JV05.entities.BankAccount;

import java.util.Locale;

public class App05
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String nameCardHolder;
        char response;
        BankAccount account;

        System.out.printf("Enter account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter account holder: ");
        nameCardHolder = sc.nextLine();
        System.out.printf("Is there na initial deposit (y/n)? ");
        response = sc.next().charAt(0);
        if (response == 'y')
        {
            System.out.printf("Enter initial deposit value: ");
            double valueAccount = sc.nextDouble();
            account = new BankAccount(accountNumber, nameCardHolder, valueAccount);
        }
        else
            account = new BankAccount(accountNumber, nameCardHolder);
        System.out.println();

        System.out.println("Acount data:");
        System.out.printf("%s\n", account.toString());
        System.out.println();
        System.out.printf("Enter a deposit value: ");
        account.Deposit(sc.nextDouble());
        System.out.println("Updated acount data:");
        System.out.printf("%s\n", account.toString());
        System.out.println();
        System.out.printf("Enter a withdraw value: ");
        account.Withdraw(sc.nextDouble());
        System.out.println("Updated acount data:");
        System.out.printf("%s\n", account.toString());
        sc.close();
    }
}
