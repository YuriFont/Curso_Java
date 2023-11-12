import java.util.Scanner;

public class In_out
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        int X;
        int in = 0;
        int out = 0;

        for(int i = 0; i < N; i++)
        {
            X = sc.nextInt();
            sc.nextLine();
            if (X >= 10 && X <= 20)
                in++;
            else
                out++;
        }
        System.out.printf("%d in\n%d out", in, out);
        sc.close();
    }
}
