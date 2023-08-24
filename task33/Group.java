package com.itacademy.home13.task33;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Student> stud;

	public Group() {
		stud = new ArrayList<Student>();
	}

	public boolean add(Student b) {
		return stud.add(b);
	}

	public void bestStudent() {
		for (int i = 0; i < stud.size(); i++) {
			Student b = stud.get(i);
			int fl = 0;
			for (int a : b.getMas()) {
				if (a < 9) {
					fl++;
				}
			}
			if (fl == 0)
				System.out.println("№ группы - " + b.getNumGroup() + "\t " + b.getName());
		}
	}

}
