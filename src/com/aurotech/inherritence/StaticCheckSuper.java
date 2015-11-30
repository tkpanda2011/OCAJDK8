package com.aurotech.inherritence;

public class StaticCheckSuper {
	private String name;
	private Integer num;
	
	public StaticCheckSuper(int num,String name) {
	
		this.name="TestString";
		this.num=num;
		System.out.println("StaticCheckSuper(int num,String name)");
	}
	public StaticCheckSuper(){
		System.out.println("StaticCheckSuper()");
	}

	public String getName() {
		return name;
	}
		public void setName(String name) {
		this.name = name;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public static String getData(){
		
		
		return "Static method of super class";
	}
	
}
