package com.tns.daytimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatterdatetimedemo {

	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Before Formatting "+obj);
		DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss:ns");
		String formattedDate = obj.format(myformat);
		System.out.println("after formatting "+formattedDate);
	}

}
