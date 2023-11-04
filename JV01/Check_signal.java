import  java.util.Scanner;

public class Check_signal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0)
            System.out.println("Esse número é negativo");
        else
            System.out.println("Esse número não é negativo");
        
        sc.close();
    }
}