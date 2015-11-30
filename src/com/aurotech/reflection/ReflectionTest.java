
/**
 * 
 */
package com.aurotech.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * @author Tripati
 *
 */
public class ReflectionTest {

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	/**
	 * @param args
	 */
	public static final String MGENDER="MALE";
	public static final String FGENDER="FEMALE";
	private static String fullName;
	private static int age;
	private static int std;
	public static void main(String[] args) {
		System.out.println("Enter Ur Choice:-- 1)Boy \n 2) Girl");
	/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br.readLine());*/
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	System.out.println("Enter Full Name");
	fullName=sc.nextLine();
	sc.nextLine();
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Enter Education");
	std=sc.nextInt();
	
	switch(choice){
	case 1:
			System.out.println("Choice for Boy");
		try {
			Class.forName("com.aurotech.reflection.Boy");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
	case 2:	
		System.out.println("Choice for Girl");
		try {
			Class dynamicClass=Class.forName("com.aurotech.reflection.Student");
			String boyClass=dynamicClass.getSimpleName();
			Constructor[] constructors = dynamicClass.getConstructors();
			System.out.println(dynamicClass.getSimpleName()+" "+constructors.length);
			if(constructors.length==1){
				try {
					Constructor constructor=constructors[0];
					Student boy=Student.class.cast(constructor.newInstance());
					boy.setAge(23);
					boy.setFullName("Twinkle");
					boy.setGender(FGENDER);
					boy.setStd(5);
					System.out.println("Boy===="+boy);
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	default:
		System.out.println("invalid Choice");
		break;
		
	}
	}

}
