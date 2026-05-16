package com.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Get today's date and time
    	LocalDateTime now = LocalDateTime.now();
        
        // Increase the date by 1 day
    	LocalDateTime tomorrow = now.plusDays(1);
        
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = tomorrow.format(formatter);
        
        // Reverse the formatted date and time
        String reversedDate = new StringBuilder(formattedDate).reverse().toString();
        
        System.out.println("Reversed DateTime: " + reversedDate);
    }
}

