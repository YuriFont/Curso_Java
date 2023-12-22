package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App12
{
    public static void main(String args[]) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char r = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            if (r == 'c')
                list.add(new Product(name, price));
            else if (r == 'u')
            {
                System.out.print("Manufactore date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.nextLine());
                list.add(new UsedProduct(name, price, date));
            }
            else
            {
                System.out.print("Customs fee: ");
                Double cf = sc.nextDouble();
                sc.nextLine();
                list.add(new ImportedProduct(name, price, cf));
            }
        }

        System.out.println();

        System.out.println("PRICE TAGS:");
        for(Product prod : list)
        {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
