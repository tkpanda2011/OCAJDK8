package com.aurotech.flowcontrol;

public class ScjpFizz {

	/**
	 * @param args
	 */
	 int x=5;
	public static void main(String[] args) {
		final ScjpFizz f1=new ScjpFizz();
		ScjpFizz f2=new ScjpFizz();
		ScjpFizz f4= swithchScjpFizz(f1,f2);
		if(f1==f4)
			f1=f2; //local final instance cannot be reinitialized  
		System.out.println("hi"+f1.x);

	}
	 static ScjpFizz swithchScjpFizz(ScjpFizz f1, ScjpFizz f2) {
		final ScjpFizz f3=f1;
		f3.x=10;
		return f3;
	}

}
