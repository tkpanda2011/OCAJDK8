package com.aurotech.collection;

import java.util.*;

public class HashSetSort extends HashSet<Person> {
	public static void main(String[] args) {
		HashSetSort g = new HashSetSort();
		g.add(new Person("Hans"));
		g.add(new Person("Lotte"));
		g.add(new Person("Jane"));
		g.add(new Person("Hans"));
		g.add(new Person("Jane"));
		System.out.println("Total: " + g.size());
	}

	
	//as HashSetSort exttends HashSet 
	//all the method override must have the same signature . 
	//add(..) ins HashSet is of generic type so expecting a Person Object not Object
	public boolean add(Object o) {
		System.out.println("Adding: " + o);
		return super.add((Person) o);
	}
}

class Person {
	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

/**
 * 
 * the above code will not comile because HashSetSort should override add(Person o)
 */
