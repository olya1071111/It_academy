package com.itacademy.home13.task4;

import java.util.*;

public class SortByNumTrain implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {
		if (t1.getNumTrain() < t2.getNumTrain()) {
			return -1;
		}
		if (t1.getNumTrain() == t2.getNumTrain()) {
			return 0;
		}

		return 0;
	}

}
