import	java.util.Scanner;

public class val_pecas
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int codP1, numP1, codP2, numP2;
		double valUniP1, valUniP2, totalValue;
		
		codP1 = sc.nextInt();
		numP1 = sc.nextInt();
		valUniP1 = sc.nextDouble();
		sc.nextLine();
		codP2 = sc.nextInt();
		numP2 = sc.nextInt();
		valUniP2 = sc.nextDouble();
		totalValue = (double) (numP1 * valUniP1) + (numP2 * valUniP2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);

		sc.close();
	}
}
