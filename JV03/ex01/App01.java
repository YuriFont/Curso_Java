import java.util.Scanner;
import java.util.Locale;

public class App01
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();
        System.out.println("Name: ");
        e.name = sc.nextLine();
        System.out.println("Gross salary: ");
        e.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        e.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", e.name, e.NetSalary());
        System.out.printf("Which percentage to increase salary? ");
        e.IncreaseSalary(sc.nextDouble());
        System.out.printf("Update data: %s, $ %.2f\n", e.name, e.NetSalary());
        sc.close();
    }
}
