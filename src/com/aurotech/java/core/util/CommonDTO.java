package com.aurotech.java.core.util;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CommonDTO implements Serializable{
	public String toString() {
		StringBuffer str=new StringBuffer();
		
		Method[] methods=getClass().getMethods();
		int lengthMethod=methods.length;
		for(int i=0;i<lengthMethod;i++){
		String methodPrefix=methods[i].getName().substring(0,3);
		if(methodPrefix.equals("get") ||methodPrefix.equals("is")){
			try {
				str.append("\n")
				   .append(methods[i].getName())
				   .append("===>").append(methods[i].invoke(this,new Object[0]));
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		return str.toString();
	}
}
