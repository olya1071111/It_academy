package com.itacademy.home13.task3;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		Group students = new Group();

		students.add(new Student(1, "Иванов", new int[] { 5, 6, 7, 3, 9 }));
		students.add(new Student(2, "Петров", new int[] { 9, 10, 9, 9, 9 }));
		students.add(new Student(2, "Сидоров", new int[] { 8, 9, 9, 10, 9 }));
		students.add(new Student(2, "Козлова", new int[] { 9, 9, 9, 10, 9 }));
		students.add(new Student(3, "Паращенко", new int[] { 5, 9, 9, 7, 9 }));
		students.add(new Student(3, "Сидоров", new int[] { 7, 9, 7, 10, 9 }));
		students.add(new Student(3, "Котлярова", new int[] { 9, 10, 9, 10, 9 }));
		students.add(new Student(1, "Исаенко", new int[] { 5, 9, 9, 7, 9 }));
		students.add(new Student(1, "Орлова", new int[] { 7, 9, 7, 10, 9 }));
		students.add(new Student(3, "Глусов", new int[] { 9, 9, 9, 10, 9 }));

		System.out.println("-----------------------------");
		System.out.println("Лучшие студенты:");
		System.out.println("-----------------------------");

		List<Student> res = students.findOfMarks(9, 10);
		print(res);
		System.out.println("-----------------------------");

	}

	public static void print(List<Student> res) {
		for (int i = 0; i < res.size(); i++) {
			System.out.println("№ группы - " + res.get(i).getNumGroup() + "\t " + res.get(i).getName());
		}
	}

}