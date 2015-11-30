package com.aurotech.accesscontrol2;

import com.aurotech.accesscontrol.AccessTest1Pk1;

public class AccessTest2extAT1Pk2 {

public static void main(String[] args){
	AccessTest1Pk1 obj1=new AccessTest1Pk1("Hello","Hi","Bye");
//	System.out.println(obj1.protVar); //Protected Members are accessible only by inheritance outside package
	System.out.println(obj1.pubVar);
	System.out.println(obj1.staticVar);
	//System.out.println(obj1.defVar);Default members are not accessible outside the package 
//	System.out.println(obj1.priVar); Private Variable are not accessble 
}

}
