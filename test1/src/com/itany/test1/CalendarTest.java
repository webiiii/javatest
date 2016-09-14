package com.itany.test1;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// construct d as current date
		GregorianCalendar d = new GregorianCalendar();
//		d.add(Calendar.DAY_OF_MONTH,-1);
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		//set d to start date of the month
		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		// get first day of week (Sunday in the U.S.)
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		//determine the required indentation for the first line
		int indent = 0;
		while ( weekday != firstDayOfWeek ){
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		
		// print weekday names
//		System.out.println(weekday + ":" + firstDayOfWeek);
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do{
			System.out.printf("%4s",weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}while(weekday != firstDayOfWeek);
		System.out.println();
		for ( int i = 1; i <= indent; i++)
			System.out.print("    ");
		
		d.set(Calendar.DAY_OF_MONTH,1);
		do{
			//print day
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d",day);
			
			// mark current day with *
			if ( day == today) 
				System.out.print("*");
			else
				System.out.print(" ");
			// advance d to the next day
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			if (weekday == firstDayOfWeek) System.out.println();
		}while(d.get(Calendar.MONTH) == month);
		
		// the loop exits when d is day 1 of the next month
		// print final end of line if necessary
		if ( weekday != firstDayOfWeek) System.out.println();
		
//		System.out.println(d.getTime().toLocaleString());
//		System.out.println(weekday + ":" + firstDayOfWeek);
//		System.out.println(Calendar.SUNDAY + ":" + Calendar.MONDAY);

	}
	
	
	
	
	
	

}
