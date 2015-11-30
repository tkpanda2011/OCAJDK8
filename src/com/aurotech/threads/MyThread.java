package com.aurotech.threads;

public class MyThread implements Runnable {

	Thread childThread=null;
	
	public MyThread() {
		childThread=new Thread(this,"MyThread11");
		
		childThread.start();
		Object obj=new MyThread();
		
		
	}

	@Override
	public void run() {
		try{
			for(int i=0;i<5;i++){
				System.out.println("Child Thread-->"+i+"==>"+Thread.currentThread());
				Thread.sleep(50);
				
			}
		}catch(InterruptedException exception){
			
		}
		System.out.println("Exiting the Child Thread===>MyThread");
	}

	
}
