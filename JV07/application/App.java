package JV07.application;

import java.util.Scanner;

import JV07.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many employees will be registered? ");
        int numEmpl = sc.nextInt();
        System.out.println();

        List<Employee> employees = new ArrayList<Employee>();

        for(int i = 0; i < numEmpl; i++)
        {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.printf("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.printf("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();

        for(Employee x : employees)
        {
            if (x.getId() == idIncrease)
            {
                System.out.printf("Enter the percentage: ");
                double percentage = sc.nextDouble();
                x.salaryIncrease(percentage);
                idIncrease = 0;
            }
        }
        if (idIncrease != 0)
            System.out.println("This id does not exist!");

        System.out.println();

        System.out.println("List of employee:");
        for(Employee x : employees)
        {
            System.out.println(x);
        }

        sc.close();
    }
}
