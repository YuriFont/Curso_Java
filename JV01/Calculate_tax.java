import java.util.Scanner;
import java.util.Locale;

public class Calculate_tax
{
    public static void main(String args[])
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double wage = sc.nextDouble();
        double tax = 0;

        if (wage <= 2000.00)
            tax = 0;
        else if (wage <= 3000.00)
            tax += (wage - 2000) * 0.08;
        else if (wage <= 4500)
        {
            tax += 1000 * 0.08;
            tax += (wage - 3000) * 0.18;
        }
        else
        {
            tax += 1000 * 0.08;
            tax += 1500 * 0.18;
            tax += (wage - 4500) * 0.28;
        }

        if (tax == 0)
            System.out.println("Isento");
        else
            System.out.printf("R$ %.2f", tax);

        sc.close();
    }
}
