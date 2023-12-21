package JV11.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import JV11.application.Employee;
import JV11.application.OutsourcedEmployee;

public class App11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Employee #1 data:");
            System.out.print("Outsource (y/n)?");
            char r = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (r == 'y')
            {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                continue;
            }
            list.add(new Employee(name, hours, valuePerHour));
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for(Employee emp : list)
        {
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
