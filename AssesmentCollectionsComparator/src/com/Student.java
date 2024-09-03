package com;

public class Student {
		int id,age;
		String name;
		Student(int id,String name,int age){
			this.id=id;
			this.age=age;
			this.name=name;
		}
		@Override
		public String toString() {
			return "Name:"+name+"  id:"+id+"  Age:"+age;
		}
}
