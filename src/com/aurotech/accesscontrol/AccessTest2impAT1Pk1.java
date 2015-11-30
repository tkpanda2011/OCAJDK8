package com.aurotech.accesscontrol;

public class AccessTest2impAT1Pk1 {


public static void main(String[] args){
	AccessTest1Pk1 obj1=new AccessTest1Pk1("Hello","Hi","Bye");
	System.out.println(obj1.protVar);
	System.out.println(obj1.pubVar);
	System.out.println(obj1.defVar);
	System.out.println(obj1.staticVar);
//	System.out.println(obj1.priVar); Private Variable are not accessble 
}

}
