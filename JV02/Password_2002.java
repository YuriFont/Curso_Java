import java.util.Scanner;

public class Password_2002
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while (number != 2002)
        {
            System.out.println("Invalid password");
            number = sc.nextInt();
        }
        System.out.println("Access allowed");
        sc.close();
    }
}