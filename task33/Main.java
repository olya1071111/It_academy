package com.itacademy.home13.task33;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Group groups = new Group();

		groups.add(new Student(1, "Иванов", new int[] { 5, 6, 7, 3, 9 }));
		groups.add(new Student(2, "Петров", new int[] { 9, 10, 9, 9, 9 }));
		groups.add(new Student(2, "Сидоров", new int[] { 8, 9, 9, 10, 9 }));
		groups.add(new Student(2, "Козлова", new int[] { 9, 9, 9, 10, 9 }));
		groups.add(new Student(3, "Паращенко", new int[] { 5, 9, 9, 7, 9 }));
		groups.add(new Student(3, "Сидоров", new int[] { 7, 9, 7, 10, 9 }));
		groups.add(new Student(3, "Котлярова", new int[] { 9, 10, 9, 10, 9 }));
		groups.add(new Student(1, "Исаенко", new int[] { 5, 9, 9, 7, 9 }));
		groups.add(new Student(1, "Орлова", new int[] { 7, 9, 7, 10, 9 }));
		groups.add(new Student(3, "Глусов", new int[] { 9, 9, 9, 10, 9}));

		System.out.println("-----------------------------");
		System.out.println("Лучшие студенты:");
		System.out.println("-----------------------------");
		
		groups.bestStudent();
			
		System.out.println("-----------------------------");
		
	}
	
}