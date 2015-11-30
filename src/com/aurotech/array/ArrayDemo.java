package com.aurotech.array;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ArrayDemo {
	public static void main(String[] args) throws ReflectiveOperationException, ReflectiveOperationException, RuntimeException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object[] refArr=new Object[3];
		refArr[0]=new Tiger("Indian Tiger");
		refArr[1]=new Tiger("Bengal Tiger");
		refArr[2]=new Tiger("asian Tiger");
		ArrayDemo addD=new ArrayDemo();	
		addD.docheck(refArr);
	}
	public void docheck(Object[] references) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		for(int i=0;i<references.length;i++){
			if(references[i] instanceof Animal){
				String name=references[i].getClass().getName();
			Class.forName(name);
				Constructor cons=references[i].getClass().getConstructor(String.class);
			Animal anm=(Animal)cons.newInstance(new String("Tiger"));
				anm.setType("Tiger"+i);
			//	Animal anm=Animal.class.cast(references[i]);
				System.out.println(anm.getType());
			
			}else if(references[i] instanceof Toy){
				
			}
		}
	}
	}


interface Animal{
	public String getType();
	public void setType(String name);
}
interface Toy{
	public String getType();
	public void setType(String toyName);
}

class Ball implements Toy{
	private String toyName;
	@Override
	public String getType() {
		return toyName;
	}

	@Override
	public void setType(String toyName) {
		this.toyName=toyName;
	}
}
class Tiger implements Animal{
	private String name;
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setType(String name) {
		this.name=name;
				}
	public Tiger(String name){
		this.name=name;
	}

}