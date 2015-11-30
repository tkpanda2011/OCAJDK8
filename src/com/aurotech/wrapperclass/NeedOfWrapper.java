package com.aurotech.wrapperclass;

public class NeedOfWrapper {
	private Integer roll;
	
	private String name;
	public NeedOfWrapper(String roll,String name) {
	this.roll=Integer.parseInt(roll);
	this.roll=Integer.valueOf(roll);
	this.name=name;
	
	
	}
	
	public int getI(){
		return roll;
	}
	public String getName(){
		return name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeedOfWrapper n=new NeedOfWrapper("100","Tripati");
		System.out.println("output i "+n.getI()+"==="+n.getName());
	}

}
