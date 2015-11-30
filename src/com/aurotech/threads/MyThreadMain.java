package com.aurotech.threads;


/**
 * 
 * @author Tripati
 * 
 * In this class we are dealing with two classes ,each class represents a thread .  
 * we can create more threads for the same , 
 * 
 * Thread.sleep(100); in MyThreadMain.java represents the current Thread . 
 * 
 * when MyThread() is called . the childThread is initiated and started upon calling the
 * start() method .in run we set sleep(50) . so the child thread stops for 50 ms 
 *
 */
public class MyThreadMain {
	public static void main(String[] args) throws InterruptedException{
		
		new MyThread();
		for(int i=0;i<5;i++){
			System.out.println("Inside main Thread===>"+i);
			Thread.sleep(100);
		}
	}
}

