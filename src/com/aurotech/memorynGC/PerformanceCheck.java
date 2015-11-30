package com.aurotech.memorynGC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

 
public class PerformanceCheck {
	public static void main(String[] argv) {
 
		String sArray[] = createArray();
 
		// convert array to list
		List<String> lList = Arrays.asList(sArray);
 
		System.out.println("\n--------- Iterator Loop -------\n");
		long lIteratorStartTime = System.nanoTime();
		System.out.println("Start: " + lIteratorStartTime);
 
		// iterator loop
		Iterator<String> iterator = lList.iterator();
		while (iterator.hasNext()) {
			String stemp = iterator.next();
		}
		long lIteratorEndTime = System.nanoTime();
		System.out.println("End: " + lIteratorEndTime);
 
		long lIteratorDifference = lIteratorEndTime - lIteratorStartTime;
		System.out.println("Iterator - Elapsed time in milliseconds: "
				+ lIteratorDifference);
 
		System.out.println("\n-------END-------");
 
		System.out.println("\n--------- For Loop --------\n");
		long lForStartTime = System.nanoTime();
		System.out.println("Start: " + lForStartTime);
 
		// for loop
		for (int i = 0; i < lList.size(); i++) {
			String stemp = (String) lList.get(i);
		}
 
		long lForEndTime = System.nanoTime();
		System.out.println("End: " + lForEndTime);
 
		long lForDifference = lForEndTime - lForStartTime;
		System.out.println("For - Elapsed time in milliseconds: "
				+ lForDifference);
 
		System.out.println("\n-------END-------");
 
		System.out.println("\n--------- While Loop -------\n");
		long lWhileStartTime = System.nanoTime();
		System.out.println("Start: " + lWhileStartTime);
 
		// while loop
		int j = 0;
		while (j < lList.size()) {
			String stemp = (String) lList.get(j);
			j++;
		}
		long lWhileEndTime = System.nanoTime();
		System.out.println("End: " + lWhileEndTime);
 
		long lWhileDifference = lWhileEndTime - lWhileStartTime;
		System.out.println("While - Elapsed time in milliseconds: "
				+ lWhileDifference);
 
		System.out.println("\n-------END-------");
		
		
		System.out.println("\n--------- For Each -------\n");
		long lForEachStartTime = System.nanoTime();
		System.out.println("Start: " + lForEachStartTime);
 
	
		ArrayList<String> al=new ArrayList<String>();
		for(String s:al){
			String stemp = s;
		}
		long lForEachEndTime = System.nanoTime();
		System.out.println("End: " + lForEachEndTime);
 
		long lForEachDifference = lForEachEndTime - lForEachStartTime;
		System.out.println("ForEach - Elapsed time in milliseconds: "
				+ lForEachDifference);
 
		System.out.println("\n-------END-------");
 
	}
 
	static String[] createArray() {
 
		String sArray[] = new String[1500000];
 
		for (int i = 0; i < 1500000; i++)
			sArray[i] = "Array " + i;
 
		return sArray;
	}
}