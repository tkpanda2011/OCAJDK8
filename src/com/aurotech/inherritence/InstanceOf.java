package com.aurotech.inherritence;

public class InstanceOf {
	public static void main(String[] args ){
		Fish f=new Walley();
		Porch p =new Porch();
		Walley w =new Walley();
		Bklugill b=new Bklugill();
		if(f instanceof Walley) System.out.println("f-w");
		if(f instanceof Porch) System.out.println("f-p");
		if(w instanceof Fish) System.out.println("w-f");
		if(w instanceof Porch) System.out.println("w-P");
		if(b instanceof Fish) System.out.println("b-f");
		
		System.out.println("Data is "+((Walley)f).getFish()); //convert the reference to object
		System.out.println("Data is "+((Porch)p).getFish()); //convert the reference to object
		System.out.println("Data is "+w.getFish());
	}
}
interface Fish{
	
}
class Porch implements Fish{
	public String getFish(){
		return "Porch";
	}
}
class Walley extends Porch{
	
	public String getFish(){
		return "Walley";
	}
}
class Bklugill{}
