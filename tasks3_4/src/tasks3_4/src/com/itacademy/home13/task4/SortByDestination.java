package com.itacademy.home13.task4;
import java.util.*;
public class SortByDestination implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {
		int res = t1.getDestination().compareTo(t2.getDestination());
		if (res==0) {
		return t1.getDepartureTime().compareTo(t2.getDepartureTime());
		}
		return res;
	}

}
