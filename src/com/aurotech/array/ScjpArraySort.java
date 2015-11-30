package com.aurotech.array;

import java.util.Arrays;
import java.util.Comparator;

public class ScjpArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words={"Goods","Bad","Balaji","Ugly"};
		
		System.out.println(words.toString());
		Comparator<String> best=new Comparator<String>(){
			public int compare(String s1,String s2){
				int a=s2.charAt(1)-s1.charAt(1);
				
				return a;
			}
		};
		Arrays.sort(words,best);
		System.out.println(words[0]+"   ");
		

	}

}
