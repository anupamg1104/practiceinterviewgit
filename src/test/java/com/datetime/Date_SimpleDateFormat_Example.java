package com.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Date_SimpleDateFormat_Example {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String dateOfExecution = dateFormat.format(date);
System.out.println("Current Date: " + dateOfExecution);
        
        // Add 1 day to the current date
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedTomorrow = tomorrow.format(formatter).toString();
        
        // Reverse the formatted date
        String reversedDate = new StringBuilder(formattedTomorrow).reverse().toString();
        
        // Output the reversed date
        System.out.println("Reversed Date: " + reversedDate);
	}
}
