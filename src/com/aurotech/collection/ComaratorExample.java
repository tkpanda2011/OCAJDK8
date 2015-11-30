package com.aurotech.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ComaratorExample {

	/**
	 * @param argsnewne
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(10,"tapan",new Teacher("Hari"));
		
		Set<Student> al=new HashSet<Student>();
		al.add(s);
		al.add(new Student(10,"d",new Teacher("Hari")));
		al.add(new Student(70,"c",new Teacher("Hari")));
		al.add(new Student(70,"c",new Teacher("Hari")));
		al.add(new Student(70,"c",new Teacher("Hari")));
		al.add(new Student(10,"z",new Teacher("Hari")));
		al.add(new Student(10,"amit",new Teacher("Hari")));
		
		//System.out.println(al);
		Comparator<Student> cmp=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
			return o1.hashCode()-o2.hashCode();
			}
			
		};
	//	Collections.sort(al, cmp);
		
		System.out.println(al);
	}

}
