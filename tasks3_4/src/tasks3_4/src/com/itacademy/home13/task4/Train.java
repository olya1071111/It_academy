package com.itacademy.home13.task4;

import java.util.Objects;

public class Train {
	private String destination;
	int numTrain;
	private String departureTime;
	
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

	

}
