package com.nit.java;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ContentInstance> l1=new ArrayList<ContentInstance>();
		ContentInstance cn=new ContentInstance();
		cn.setId(10);
		cn.setName("Braja");
		l1.add(cn);
		System.out.println(l1);
		

	}

}
