package com.aurotech.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayGenCheck<T,E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private List<T>  getGenericListFRomArray(T[] array,List<T> list){
	//	List<T> list=new ArrayList<T>();
		for(T genricVar : array){
			list.add(genricVar);
		}
		
		return list;
	}
}
