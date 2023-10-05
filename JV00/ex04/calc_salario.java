import	java.util.Scanner;

public class calc_salario
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int numFunc, numHFunc;
		double valH, salary;

		numFunc = sc.nextInt();
		sc.nextLine();
		numHFunc = sc.nextInt();
		sc.nextLine();
		valH = sc.nextDouble();
		salary = numHFunc * valH;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f\n", salary);

		sc.close();
	}
}
