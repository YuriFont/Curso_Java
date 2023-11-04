import java.util.Scanner;

public class Fuel_station
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int alcohol = 0; 
        int gasoline = 0; 
        int diesel = 0;
        int vote = sc.nextInt();

        while (vote != 4)
        {
            if (vote == 1)
                alcohol++;
            else if (vote == 2)
                gasoline++;
            else
                diesel++;
            vote = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcohol: %dn\n", alcohol);
        System.out.printf("Gasoline: %d\n", gasoline);
        System.out.printf("Diesel: %d", diesel);
        sc.close();
    }
}
