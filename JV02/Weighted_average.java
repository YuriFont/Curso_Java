import java.util.Scanner;
import java.util.Locale;

public class Weighted_average
{
    public static void main(String args[])
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            double case1 = sc.nextDouble();
            double case2 = sc.nextDouble();
            double case3 = sc.nextDouble();
            double av = (case1 * 2 + case2 * 3 + case3 * 5) / 10;
            System.out.printf("%.1f\n", av);
        }
        sc.close();
    }
}
