package com.itacademy.home13.task4;

public class Train implements Comparable<Train> {
	private String destination;
	int numTrain;
	private String departureTime;
	String TEMPLATE = "numTrain = %d, destination = '%s'";

	public Train() {
	}

	public Train(String destination, int numTrain, String departureTime) {
		super();
		this.destination = destination;
		this.numTrain = numTrain;
		this.departureTime = departureTime;

	}

	public int getNumTrain() {
		return numTrain;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int compareTo(Train o) {
	return this.numTrain-o.numTrain;
	}
	
	@Override
	public String toString() {
		return "number - " + numTrain + "\t rout - " + destination + "\t time - " + departureTime;
	}

}
