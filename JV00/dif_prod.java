import java.util.Scanner;

public class dif_prod 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int	a, b, c, d, result;

		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		result = (a * b) - (c * d);

		System.out.printf("DIFERENCA = %d\n", result);

		sc.close();
	}
}
