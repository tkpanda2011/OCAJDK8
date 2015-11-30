package com.aurotech.accesscontrol2;

public class BreakContinuecheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<20;i++){
			if(i==5 || i==10 || i==15){
				System.out.println("value==="+i);
				break;
				
			}else if (i==3 || i==9 || i==12){
				continue;//System.out.println("hjvalue==="+i);
				

			}
			System.out.println("loop "+i);
		}

	}

}
