import java.util.Scanner;

public class soma
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int	a;
		int	b;
		int	soma;

		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		System.out.printf("SOMA = %d\n", soma);
		sc.close();
	}
}
