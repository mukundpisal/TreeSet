package com.prowing.Treeset.Student;

public class Student implements Comparable<Student> {

	int roll;
	String name;

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	public int compareTo(Student o) {
		
		if(roll== o.roll)
			return 0;
		else if(roll>o.roll)
		return -1;
		else
		return 1;
	}

//	public int compareTo(Student o) {
//		
//		
//		return this.name.compareTo(o.name);
//
//	}
}
