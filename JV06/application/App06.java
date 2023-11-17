package JV06.application;

import java.util.Locale;
import java.util.Scanner;

import JV06.entities.Room;

public class App06 
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        System.out.printf("How many rooms will be rented? ");
        int nRoom = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= nRoom; i++)
        {
            System.out.println("Rent #" + i + ":");
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Room: ");
            int number = sc.nextInt();
            rooms[number] = new Room(number, name, email);
            System.out.println();
        }

        System.out.println("Busy rooms:");

        for(int i = 0; i < 10; i++)
        {
            if (rooms[i] != null)
                System.out.println(rooms[i]);
        }
        sc.close();
    }
}
