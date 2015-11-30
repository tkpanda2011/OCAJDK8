package com.aurotech.collection;

import java.sql.Date;

public class ImmutableExample {
public static void main(String[] args){
		Student s=new Student(10,"Tripati",new Teacher("Hari"));
		System.out.println(s);
	//	s.getDate().setDate(1000000000);
		s.getTeacher().setName("Govinda");
		System.out.println(s);
}

}
 class Student {
	private final int no;
	private final String name;
	//private final Date date;
	private final Teacher teacher;
	
	
	public Student(int no, String name, Teacher teacher) {
		super();
		this.no = no;
		this.name = name;
		//this.date = date;
		this.teacher=teacher;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	/*public Date getDate() {
		return (Date)date.clone();
	}*/
	
	public Teacher getTeacher(){
		return (Teacher)teacher.clone();
	}
	@Override
	public int hashCode() {
		
		return new StringBuilder("").append(no).append(name).toString().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==obj.hashCode()){
			return true;
		}else {
			return false; 
		}
	}
	@Override
	public String toString() {
		return "\nStudent [no=" + no + ", name=" + name + ", date=" +  "  Teacher="+teacher + "]";
	} 
	
	
}
class Teacher implements Cloneable{
	String name;

	public Teacher(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	} 
	public Object clone(){
		Teacher t=null;
		try {
			t=(Teacher) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
}