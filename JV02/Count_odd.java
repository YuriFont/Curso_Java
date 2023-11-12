import java.util.Scanner;

public class Count_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i = 1; number >= i; i++)
        {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
        sc.close();
    }
}
