package application;

import java.util.Locale;
import java.util.Scanner;

import model.exceptions.DomainException;

public class App15
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try
        {

        }
        catch (DomainException e)
        {
            System.out.println("Error in withdraw");
        }
        sc.close();
    }    
}
