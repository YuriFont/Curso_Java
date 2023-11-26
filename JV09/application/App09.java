package JV09.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App09
{
    public static void main(String[] args)
    {
        LocalDate d01 = LocalDate.parse("2023-11-26");
        LocalDateTime d02 = LocalDateTime.parse("2023-11-26T12:36");
        Instant d03 = Instant.parse("2023-11-26T15:37:59Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDateTime d04 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());

        // System.out.println("d01 = " + d01.format(fmt1));
        // System.out.println("d02 = " + d02.format(fmt2));
        // System.out.println("d03 = " + fmt3.format(d03));
        // System.out.println("d04 = " + d04);
    }
}
