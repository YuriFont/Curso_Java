import java.util.Scanner;
import java.util.Locale;

public class App00
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();
        System.out.println("AREA = " + r.Area());
        System.out.println("PERIMETER = " + r.Perimeter());
        System.out.println("DIAGONAL = " + r.Diagonal());
        sc.close();
    }
}