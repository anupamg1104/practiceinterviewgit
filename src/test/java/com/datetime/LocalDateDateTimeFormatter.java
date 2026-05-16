package com.datetime;
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDateTimeFormatter {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Increase the date by 1 day
        LocalDate tomorrow = today.plusDays(1);
        
        // Format the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = tomorrow.format(formatter);
        
        // Reverse the formatted date
        String reversedDate = new StringBuilder(formattedDate).reverse().toString();
        
        System.out.println("Reversed Date: " + reversedDate);
    }
}

