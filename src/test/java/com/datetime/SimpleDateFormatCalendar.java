package com.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatCalendar {
    public static void main(String[] args) {
        // Get today's date
        Calendar calendar = Calendar.getInstance();
        
        // Increase the date by 1 day
        calendar.add(Calendar.DATE, 1);
        
        // Format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(calendar.getTime());
        
        // Reverse the formatted date
        String reversedDate = new StringBuilder(formattedDate).reverse().toString();
        
        System.out.println("Reversed Date: " + reversedDate);
    }
}

