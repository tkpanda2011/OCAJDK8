package com.aurotech.accesscontrol2;

public class FInalCheckOnReference {

	/**
	 * @param args
	 */
	private static final Test test=new Test(5,"Trpati");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FInalCheckOnReference fr=new FInalCheckOnReference();
		System.out.println(fr.getTest());
		fr.modifyTest(fr.getTest());
		System.out.println(fr.getTest());
	}
	public Test getTest(){
		return test;
	}
	public void modifyTest(Test test){
	///	this.test=new Test(100,"laltu");
		test.setA(100);
		test.setName("laltu");
	}

}
class Test{
	private int a;
	String name;
	
	public Test(int a,String name){
		this.a=a;
		this.name=name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return a+"   "+name;
	}
	
}