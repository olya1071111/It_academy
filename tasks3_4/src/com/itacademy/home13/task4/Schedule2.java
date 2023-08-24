package com.itacademy.home13.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Schedule2 {

	private List<Train> trains;

	public Schedule2() {
		trains = new ArrayList<Train>();
	}

	public boolean add1(Train b) {
		return trains.add(b);
	}

	public Train findByNumber(int numTrain) {

		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			if (t.getNumTrain() == numTrain) {
				return t;
			}
		}
		return null;
	}

	public void sortForNumTrain() {
		Collections.sort(trains, new SortByNumTrain());
		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			System.out.println(t.toString());
		}
	}
	
	public void sortForDestination() {
		Collections.sort(trains, new SortByDestination());
		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			System.out.println(t.toString());
		}
	}

	
	public void printShedule() {
		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			System.out.println(t.toString());
	}
	}
}
