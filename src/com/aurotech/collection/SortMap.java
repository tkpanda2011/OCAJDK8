package com.aurotech.collection;

import java.util.Arrays;

public class SortMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Object [] myObjects = {
				 new Integer(12),
				 new String("foo"),
				 new Integer(5),
				 new Boolean(true)
				 };
		Arrays.sort(myObjects); // class cast 
				System.out.print( myObjects);
				
				for(int i=0; i<myObjects.length; i++) {
					 System.out.print(myObjects[i].toString());
					 System.out.print(" ");
					 }
	}

}
