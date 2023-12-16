package JV10.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import JV10.entities.Client;
import JV10.entities.Order;
import JV10.entities.OrderItem;
import JV10.entities.Product;
import JV10.entities_enum.OrderStatus;

public class App10
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String emailClient = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        
        Client client = new Client(nameClient, emailClient, birthDate);

        System.out.println("Enter order date:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            order.addItens(new OrderItem(quantity, product));
        }
        System.out.println();

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}