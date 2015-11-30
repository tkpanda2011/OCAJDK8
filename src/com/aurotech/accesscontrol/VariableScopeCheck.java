package com.aurotech.accesscontrol;

public class VariableScopeCheck {
	static int s=343;
	int x;
	{
		x=35;
		int x2=45;
	}
	VariableScopeCheck(){
		x+=8;
		int x3=6;
	}
	void doStuff(){
		int y=0;
		for (int z=0;z<4;z++){
			y+=z+x;
		}
		System.out.println("Value of x"+x+"   "+y);
	}
	public static void main(String[] args){
		VariableScopeCheck vc= new VariableScopeCheck();
		System.out.println("Value of x"+vc.x);	
	//	System.out.println("Value of x"+x2);
		vc.doStuff();
	}
	
}
