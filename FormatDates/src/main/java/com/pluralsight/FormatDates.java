package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        // Formatters
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss z");
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");
        // Time Zones
        LocalDate today = LocalDate.now();
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime localTime = ZonedDateTime.now();
        // Time Zone + Formatters Converters
        String date1 = today.format(format1);
        String date2 = today.format(format2);
        String date3 = today.format(format3);
        String date4 = gmtTime.format(format4);
        String date5 = localTime.format(format5);
        // Printed Dates
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
    }
}
