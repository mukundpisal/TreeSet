package com.prowing.Treeset.Student;

import java.util.TreeSet;

public class StudentTest{
	
	public static void main(String[] args) {
		
		
		
		TreeSet ts1 = new TreeSet();

		ts1.add(new Student(101, "AAA"));
		ts1.add(new Student(103, "DDD"));
		ts1.add(new Student(104, "BBB"));
		ts1.add(new Student(102, "CCC"));
		System.out.println(ts1);


	}	

}
