package com.aurotech.reflection;

import com.aurotech.java.core.util.CommonDTO;

public class Boy extends CommonDTO implements Student{
	private String fullName;
	private int age;
	private int std;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Boy(String fullName, int age, int std, String gender) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.std = std;
		this.gender = gender;
	}
	public Boy(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	
	
}
