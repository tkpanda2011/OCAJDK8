package com.aurotech.inherritence;

public class StaticCheckSub extends StaticCheckSuper{

	private String name;
	private Integer num;
	 
	public StaticCheckSub() {
		System.out.println("StaticCheckSub()");
	}
	public StaticCheckSub(String name,int num) {
		System.out.println("StaticCheckSub()");
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
	/*public static String getData(){
		
		
		return "Static method of sub class";
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticCheckSub sub=new StaticCheckSub("tripati",100);
		StaticCheckSuper sup=new StaticCheckSuper(100, "bhaskar");
		
		System.out.println(sup);
		System.out.println(sub.getData());
	}

}
