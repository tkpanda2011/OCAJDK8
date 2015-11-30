package com.aurotech.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("suman", 10);
		map.put("suman1", 11);
		map.put("suman2", 12);
		map.put("suman3", 13);
		map.put("suman4", 14);
		reverseValues(map);
		System.out.println("==>"+map);

	}

	private static void reverseValues(Map<String, Integer> map) {
		Set<String> set=map.keySet();
		List<String> list=new ArrayList<String>(set);
		for(int i=0;i<list.size()/2;i++){
			int temp=map.get(list.get(i));
			int temp2=map.get(list.get(list.size()-(i+1)));
			System.out.println("swaping values for"+ temp +"and" +temp2);
		}
		
	}

}
