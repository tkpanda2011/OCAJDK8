package com.aurotech.reflection;

import com.aurotech.java.core.util.CommonDTO;

public class Girl extends CommonDTO implements Student{
	private String fullName;
	private int age;
	private int std;
	private String gender;
	private boolean maritalStatus;
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
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
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
	public Girl(){
		System.out.println("GirlConstructor Invoked");
	}
}
