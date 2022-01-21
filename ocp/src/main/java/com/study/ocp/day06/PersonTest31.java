package com.study.ocp.day06;

import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class PersonTest31 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Student s1 = new Student("Vincent", 18, 100);
		Student s2 = new Student("Helen", 19, 75);
		Student s3 = new Student("Bobo", 18, 80);
		Teacher t1 = new Teacher("Anita", 30, 70000);
		Teacher t2 = new Teacher("Jane", 28, 650000);
		
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(s1);
		persons.add(s2);
		persons.add(s3);
		persons.add(t1);
		persons.add(t2);
		//System.out.println(persons);
		//請問 persons 的平均年齡 = ?
		double avgOfAge =persons.stream() 
						.filter(p -> p.getName() != null)
						.filter(p -> p.getAge() != null)
						//.peek(System.out::println)
						.mapToInt(p ->p.getAge())
						//.peek(System.out::println)
						.average()
						.getAsDouble();
						//forEach(System.out::println)
		System.out.printf("請問persons 的平均年齡 = %.1f\n", avgOfAge);
		//請問平均分數 = ?
		double avgOfScore = persons.stream()
			.filter(p -> p.getName() != null)
			.filter(p -> p.getAge() != null)
			.filter(p -> p.getClass().getSimpleName().equals("Student"))
			//.mapToInt(p ->((Student)p).getScore())
			.map(p -> (Student)p)//將Person 物件轉換成 Student 物件
			.mapToInt(s -> s.getScore())//	相當於 mapToInt (Student::getScore)
			.peek(System.out::println)
			.average()
			.getAsDouble();
		System.out.printf("請問平均分數 = %.1f\n", avgOfScore);
		//請問平均薪資 ?
		double avgOfSalary = persons.stream()
				.filter(p -> p.getName() != null)
				.filter(p -> p.getAge() != null)
				.filter(p -> p.getClass().getSimpleName().equals("Teacher"))
				.map(p ->(Teacher)p)
				.mapToInt(Teacher::getSalary)
				.peek(System.out::println)
				.average()
				.getAsDouble();
			System.out.printf("請問平均薪資 = %,.1f\n", avgOfSalary);
				
			//請問姓名總字數 = ?
			
			
	}

}
