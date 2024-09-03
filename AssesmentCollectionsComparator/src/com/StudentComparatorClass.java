package com;
import java.util.*; 
public class StudentComparatorClass implements Comparator<Student> {
	
	@Override
	public int compare(Student x,Student y) {
		return x.id-y.id;
	}
	
}
