package com.aurotech.collection;

import java.util.HashSet;
import java.util.Set;

public class NullCheckHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<String>();
		
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set.add(null));
		System.out.println(set.add("hello"));
		System.out.println(set.remove(null));
		System.out.println(set);
	}

}
