package com.itacademy.home13.task44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.itacademy.home13.task33.Student;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		Schedule t = new Schedule();

		t.add1(new Train("Минск", 344, new Time()));
		t.add1(new Train("Гомель", 345, new Time()));
		t.add1(new Train("Пинск", 896, new Time()));
		t.add1(new Train("Витебск", 127, new Time()));
		t.add1(new Train("Гомель", 592, new Time()));

		System.out.println(" Sorting by number of trains:");
		
		List<Train> result = t.sortForNumTrain();
		print(result);
		System.out.println();

		// поиск по номеру поезда
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print(" Enter the train namber > ");
			while (!sc.hasNextInt()) {
				String s = sc.nextLine();
				System.out.println(" Value of train is negative! ");
				System.out.print(" Enter the train namber > ");
			}
			int x = sc.nextInt();
			Train trains = t.findByNumber(x);
			System.out.println(trains.toString());

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		System.out.println(" Sorting by destination path:");
		result = t.sortForDestination();
		print(result);
	}
	
	public static void print(List<Train> result) {
		for (Train a: result) {
			System.out.println(a.toString());
			}
		}
	}

