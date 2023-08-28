package com.itacademy.home13.task4;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

	private List<Train> trains;

	public Schedule() {
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

	public List<Train> sortForNumTrain() {
		for (int i = 0; i < trains.size() - 1; i++) {
			Train minNumberTrain = trains.get(i);
			int minTrainNumberIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				if (trains.get(j).getNumTrain() < minNumberTrain.getNumTrain()) {
					minNumberTrain = trains.get(j);
					minTrainNumberIndex = j;
				}
			}
			Train temp = trains.get(i);
			trains.set(i, minNumberTrain);
			trains.set(minTrainNumberIndex, temp);
		}
		return trains;
	}

	public List<Train> sortForDestination() {
		
		for (int i = 0; i < trains.size() - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < trains.size(); j++) {
				if (trains.get(j).getDestination().compareTo(trains.get(minIndex).getDestination())<0) {
				minIndex = j;
				} else if (trains.get(j).getDestination().compareTo(trains.get(minIndex).getDestination())==0) {
					if (trains.get(j).getDepartureTime().compareTime(trains.get(j).getDepartureTime(),
							trains.get(minIndex).getDepartureTime())) {
						minIndex = j;
					}
				}
			}
			Train temp = trains.get(i);
			trains.set(i, trains.get(minIndex));
			trains.set(minIndex, temp);
		}
		return trains;
	}
}
