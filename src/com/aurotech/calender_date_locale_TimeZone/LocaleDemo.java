package com.aurotech.calender_date_locale_TimeZone;

import java.util.Locale;


/*
 * public final class Locale
extends Object
implements Cloneable, Serializable
A Locale object represents a specific geographical, political, or cultural region. An operation that requires a Locale to perform its task is called locale-sensitive and uses the Locale to tailor information for the user. For example, displaying a number is a locale-sensitive operation--the number should be formatted according to the customs/conventions of the user's native country, region, or culture.

Create a Locale object using the constructors in this class:

 Locale(String language)
 Locale(String language, String country)
 Locale(String language, String country, String variant)
 */

public class LocaleDemo {
	public static void main(String args[]){
		Locale local=new Locale(Locale.FRENCH.getLanguage(),Locale.FRANCE.getCountry());
		System.out.println("The Language  code is "+local.getLanguage()+"  The Language Name is  "+local.getDisplayLanguage(local));
		System.out.println("The country code is "+local.getCountry()+"The Country Name is "+local.getDisplayCountry());
		System.out.println("The ISO3 Country Code is "+local.getISO3Country()+"  Language"+local.getISO3Language());
		
		
		Locale local2=new Locale(Locale.KOREA.getLanguage(),Locale.KOREAN.getCountry());
		
		
		System.out.println("The Language  code is "+local2.getLanguage()+"  The Language Name is  "+local2.getDisplayLanguage(local));
		System.out.println("The country code is "+local2.getCountry()+"The Country Name is "+local2.getDisplayCountry());
		System.out.println("The ISO3 Country Code is "+local2.getISO3Country()+"  Language"+local2.getISO3Language());
		
		String[] countries=Locale.getISOCountries();
		String[]  languages=Locale.getISOLanguages();
		Locale templocal=null;
		System.out.println("length country"+countries.length+" languages"+languages.length);
		
		
		for(int i=0; i<languages.length-1;i++){
			System.out.println("\nLanguage of countryCode "+countries[i]+" is "+languages[i]);
			templocal=new Locale(languages[i],countries[i]);
			System.out.println("\nLanguage of Country"+templocal.getDisplayCountry()+"  is  "+templocal.getDisplayLanguage());
			
			System.out.println("\nLanguage of Country"+templocal.getISO3Country()+"  is  "+templocal.getISO3Language());
		}
	
		System.out.println("The Default Country code  "+ Locale.getDefault().getCountry()+"  and CountrName is "+Locale.getDefault().getDisplayCountry());
	}
}
