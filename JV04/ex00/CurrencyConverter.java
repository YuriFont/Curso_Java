public class CurrencyConverter
{

    public static final double IOF = 0.06;

    public static double ConverterDolar(double dollar, double value)
    {
        double valueWTax = value * dollar;
        return (valueWTax + (valueWTax * IOF));
    }
}