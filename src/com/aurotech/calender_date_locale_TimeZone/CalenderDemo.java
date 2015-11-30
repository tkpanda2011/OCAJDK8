package com.aurotech.calender_date_locale_TimeZone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalenderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calender=GregorianCalendar.getInstance();
		
		//System.out.println(calender.getTime());
		TimeZone timzone=	TimeZone.getTimeZone("America/Los_Angeles");
	
	//	calender= new Calendar(timzone,new Locale("English","US"));
		String[] tmzones=TimeZone.getAvailableIDs();
		for(int i=0;i<tmzones.length;i++){
	//		System.out.println("\n  "+tmzones[i]);
		}
		//timzone.setID("America/Juneau");
		DateFormat df=new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
		calender.setTimeZone(timzone);
		Date date=calender.getTime();
		
		System.out.println("\n"+calender.getTime());
		System.out.println("\n Time in america is"+df.format(date));
		
	}

}
