package com.aurotech.accesscontrol2;

import com.aurotech.accesscontrol.AccessTest1Pk1;

public class AccessTest2impAT1Pk2 extends AccessTest1Pk1{
//	public static int staticVar=30;
public static void main(String[] args){
	AccessTest1Pk1 obj1=new AccessTest1Pk1("Hello","Hi","Bye");
//	System.out.println(obj1.protVar); //Protected Members are accessible only by inheritance outside package
	
	System.out.println(obj1.pubVar);
	System.out.println(obj1.staticVar);
	//System.out.println(obj1.defVar);Default members are not accessible outside the package 
//	System.out.println(obj1.priVar); Private Variable are not accessble 
	AccessTest2impAT1Pk2 obj2=new AccessTest2impAT1Pk2("DOLU","MOLU","GOLU");
	System.out.println("Superclass details starts");
	obj2.printSuperclass();
	System.out.println("Superclass details ends");
	System.out.println("Subclass Static "+staticVar);
	System.out.println("Subclass Static "+obj2.protVar);//by subclass ref supclass protect members are access
}

public AccessTest2impAT1Pk2(String priVar, String protVar, String pubVar) {
	super(priVar, protVar, pubVar);
	
}
private void printSuperclass(){
	System.out.println(super.protVar);
	System.out.println(super.pubVar);
	System.out.println(super.staticVar);
}
}
