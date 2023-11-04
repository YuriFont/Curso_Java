import	java.util.Scanner;

public	class	area_circulo
{
	public	static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double	raio, pi, area;

		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2.0);

		System.out.printf("A = %.4f\n", area);

		sc.close();
	}
}
