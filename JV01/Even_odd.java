import java.util.Scanner;

public class Even_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();

        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Ímpar");

        sc.close();
    }
}
