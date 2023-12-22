package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class App13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char resp = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();
            if (resp == 'i')
            {
                System.out.print("Health expenditures: ");
                Double health = sc.nextDouble();
                sc.nextLine();
                list.add(new PhysicalPerson(name, anualIncome, health));
            }
            else
            {
                System.out.print("Number of employees: ");
                Integer numEm = sc.nextInt();
                sc.nextLine();
                list.add(new LegalPerson(name, anualIncome, numEm));
            }
        }
        System.out.println();

        Double totalTax = 0.0;
        System.out.println("TAXES PAID:");
        for(Person per : list)
        {
            System.out.println(per);
            totalTax += (per.taxCalculation());
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));
        sc.close();
    }  
}
