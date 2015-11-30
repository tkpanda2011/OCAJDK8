package com.aurotech.accesscontrol;

public class MethodRefPass {

	public static void main(String[] args){
		MethodRefPass mt=new MethodRefPass();
		Foo f=new Foo();
		System.out.println(f);
		mt.fooTest(f);
		System.out.println("((((Caller method Foo)))))"+f.getFoo());
	}
	public void fooTest(Foo f){
		System.out.println(f);
		f.setFoo(200);
		System.out.println(f.getFoo());
		f=new Foo();
		f.setFoo(123);
		System.out.println("______"+f.getFoo());
		
	}
}

class Foo{
	int foo=10;
	public int getFoo(){
		return foo;
	}
	public void setFoo(int foo){
		this.foo=foo;
	}
}