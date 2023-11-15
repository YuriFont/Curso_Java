import java.util.Scanner;
import java.util.Locale;

public class App
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double priceDollar;
        double dollarBought;

        System.out.printf("What is the dollar price? ");
        priceDollar = sc.nextDouble();
        System.out.printf("How many dollar will be bought? ");
        dollarBought = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.ConverterDolar(priceDollar, dollarBought));
        sc.close();
    }
}