package com.itacademy.home13.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		Schedule2 t = new Schedule2();

		t.add1(new Train("Минск", 344, "14.21"));
		t.add1(new Train("Гомель", 345, "18.38"));
		t.add1(new Train("Пинск", 896, "03.52"));
		t.add1(new Train("Витебск", 127, "11.01"));
		t.add1(new Train("Гомель", 592, "16.19"));

		System.out.println("Sorting by number of trains:");
		t.sortForNumTrain();

		// поезд по заданному значению
		Train trains = t.findByNumber(344);
		if (trains != null) {
			System.out.println("-------------------------------------------------");
			System.out.println("Train  ");
			System.out.println("number: " + trains.getNumTrain());
			System.out.println("route : " + trains.getDestination());
			System.out.println("Time  : " + trains.getDepartureTime());
			System.out.println("-------------------------------------------------");
		} else {
			System.out.println("No such train in the Schedule.");
		}

		System.out.println("Sorting by destination path:");
		t.sortForDestination();
	}
}