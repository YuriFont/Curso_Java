import java.util.Scanner;

public class Are_multiple
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0)
            System.err.println("São multiplos");
        else
            System.out.println("Não são multiplos");

        sc.close();
    }
}
