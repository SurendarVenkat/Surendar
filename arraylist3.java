package Collection;

import java.util.*;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

}

public class arraylist3 {

	public static void main(String[] args) {
		Student s1 = new Student(100, "Vicky", 21);
		Student s2 = new Student(101, "Karthick", 21);
		Student s3 = new Student(102, "kowshik", 21);
		ArrayList<Student> obj1 = new ArrayList<Student>();// user-define
		obj1.add(s1);
		obj1.add(s2);
		obj1.add(s3);

		for (Student details : obj1) // student is class
		{
			System.out.println(details.rollno + " " + details.name + " " + details.age);
		}

	}

}
