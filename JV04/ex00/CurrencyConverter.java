public class CurrencyConverter
{
    public static double ConverterDolar(double dollar, double value)
    {
        double valueWTax = value * dollar;
        return (valueWTax + (valueWTax * 6 / 100));
    }
}