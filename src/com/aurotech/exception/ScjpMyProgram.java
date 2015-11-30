package com.aurotech.exception;

public class ScjpMyProgram {
	public static void throwit(){
		throw new RuntimeException();
	}
	public static void main(String args[]){
		try{
			System.out.println("hello world");
			throwit();
			System.out.println("exception");
			
		}finally{
			System.out.println("test");
		}
	}
}
