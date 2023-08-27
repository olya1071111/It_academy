package com.itacademy.home13.task44;

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

	@SuppressWarnings("unused")
	public Train findByNumber(int numTrain) {

		for (int i = 0; i < trains.size(); i++) {
			Train t = trains.get(i);
			if (t.getNumTrain() == numTrain) {
				return t;
			} else {
				throw new RuntimeException("There is no train whith this number");
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
			Train minDestination = trains.get(i);
			int minDestinationIndex = i;

			for (int j = i + 1; j < trains.size(); j++) {
				if (trains.get(j).getDestination().equals(minDestination.getDestination())) {
					minDestination = trains.get(j);
					minDestinationIndex = j;
				} else if (trains.get(j).getDestination().equals(minDestination.getDestination())) {
					if (trains.get(j).getDepartureTime().compareTime(trains.get(j).getDepartureTime(),
							trains.get(minDestinationIndex).getDepartureTime())) {
						minDestinationIndex = j;
					}
				}
			}
			Train temp = trains.get(i);
			trains.set(i, minDestination);
			trains.set(minDestinationIndex, temp);
		}
		return trains;
	}
}
