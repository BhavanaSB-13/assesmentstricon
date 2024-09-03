package com;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMainClass {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Student s1=new Student(06,"Bhavana",21);
		Student s2=new Student(32,"Pavi",22);
		Student s3=new Student(02,"Rakshu",20);
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println("Enter ur choice:\n 1.Sort by id\n 2.Sort by age  ");
		int n=sc.nextInt();
		if(n!=1&&n!=2) {
			System.out.println("Invalid input");
		}
		else if(n==1) {

		}
		for(Student s:ar) {
			System.out.println(s);
		}
		sc.close();
	}
}
