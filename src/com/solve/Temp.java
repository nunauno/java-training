package com.solve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
	int id;
	String name;
	int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Temp {

	private static List<Student> merges(List<Student> students) {

		int p1 = 0;
		int p2 = 0;
		List<Student> tmp = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				p1 = students.get(i).getId();
				p2 = students.get(j).getId();
				if (p1 == p2) {
					students.get(i).setName((students.get(i).getName() + students.get(j).getName()));
					tmp.add(students.get(j));
				}
			}
		}

		for (Student s : tmp) {
			System.out.println(s);
		}
		System.out.println("-------------");
		students.removeAll(tmp);

		return students;
	}
	
	private static List<Student> merges2(List<Student> students) {
		for(int i = 0 ; i < students.size(); i++) {
			Student stA = students.get(i);
			Student tmp = students.get(i);
			for(int n = i + 1 ; n < students.size() ; n++) {
				// i : 1 == n : 2
				if(stA.getId() == students.get(n).getId()) {
					Student stB = students.get(n);
					tmp.setName(stA.getName() + stB.getName());
					
					
					students.remove(n);
				}
			}
		}
		return students;
	}
	

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++) {
			for(int j= 0 ; j < 5 ; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
	}
}
