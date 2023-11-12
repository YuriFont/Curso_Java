import java.util.Scanner;
import java.util.Locale;

public class App02
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student a = new Student();

        a.Name = sc.nextLine();
        a.N1 = sc.nextDouble();
        a.N2 = sc.nextDouble();
        a.N3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f\n", a.FinalGrade());
        System.out.printf("%s\n", a.Result());
        if (a.FinalGrade() < 60.00)
            System.out.printf("MISSING %.2f POINTS", a.Missed());
    }
}