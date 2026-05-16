package com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Format the date as "yyyy/MM/dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = today.format(formatter);
        System.out.println("Current Date: " + formattedDate);
        
        // Add 1 day to the current date
        LocalDate tomorrow = today.plusDays(1);
        String formattedTomorrow = tomorrow.format(formatter);
        
        // Reverse the formatted date
        String reversedDate = new StringBuilder(formattedTomorrow).reverse().toString();
        
        // Output the reversed date
        System.out.println("Reversed Date: " + reversedDate);
    }
}

