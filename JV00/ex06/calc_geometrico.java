import	java.util.Scanner;

public	class calc_geometrico
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double	a, b, c, aT, aC, aTra, aQ, aR, pi;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		aT = (a * c) / 2.0;
		aC = pi * c * c;
		aTra = (a + b) * c / 2;
		aQ = b * b;
		aR = a * b;

		System.out.printf("TRIANGULO: %.3f%n", aT);
		System.out.printf("CIRCULO: %.3f%n", aC);
		System.out.printf("TRAPEZIO: %.3f%n", aTra);
		System.out.printf("QUADRADO: %.3f%n", aQ);
		System.out.printf("RETANGULO: %.3f%n", aR);

		sc.close();
	}
}
