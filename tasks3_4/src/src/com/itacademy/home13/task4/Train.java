package com.itacademy.home13.task4;

import java.util.Objects;

public class Train {
	private String destination;
	private int numTrain;
	private Time departureTime;

	public Train() {
	}

	public Train(String destination, int numTrain, Time departureTime) {
		super();
		this.destination = destination;
		this.numTrain = numTrain;
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumTrain() {
		return numTrain;
	}

	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, numTrain);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& numTrain == other.numTrain;
	}

	@Override
	public String toString() {
		return " numTrain - " + numTrain + "\t Destination: " + destination + "\t time - "
				+ departureTime.getTimeFormated();
	}

}
