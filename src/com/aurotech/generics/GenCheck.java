package com.aurotech.generics;

import java.util.ArrayList;
import java.util.Collection;

import com.aurotech.dto.Employee;

public class GenCheck<T> {
	private T object;
	
	
	public GenCheck(T object){
	
		this.object=object;
	}
	public T getObject(){
		return object;
	}
	
	public String  sum(T a, T b) {
	   if((a instanceof Integer) && (b instanceof Integer)){
		   int s=Integer.parseInt(a.toString());
		   int s2=Integer.parseInt(b.toString());
		   return String.valueOf(s+s2);
	   }
	   return "";
		}
	public  Collection<? extends Employee>  getCollection(){
		return new ArrayList<Employee>();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenCheck<String> a=new GenCheck<String>("Hello");
		
		GenCheck<String> b=new GenCheck<String>("Hello");

	}

}
