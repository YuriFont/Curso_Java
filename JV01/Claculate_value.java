import java.util.Scanner;

public class Claculate_value
{
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int prod = sc.nextInt();
        int amt = sc.nextInt();
        double total = 0;

        switch (prod)
        {
            case 1:
                total = 4 * amt;
                break;
            
            case 2:
                total = 4.5 * amt;
                break;
            
            case 3:
                total = 5 * amt;
                break;
            
            case 4:
                total = 2 * amt;
                break;
            
            case 5:
                total = 1.5 * amt;
                break;
        }

        System.out.printf("Total: R$ %.2f", total);

        sc.close();

    }
}
