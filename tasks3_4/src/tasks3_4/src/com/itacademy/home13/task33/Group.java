package com.itacademy.home13.task33;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Student> stud;
	private final static int RANGE_OF_MARKS = 2;

	public Group() {
		stud = new ArrayList<Student>();
	}

	public boolean add(Student b) {
		return stud.add(b);
	}

	public List<Student> findOfMarks(int mark1, int mark2) {
		List<Student> result = new ArrayList<>();
		for (Student s : stud) {
			int[] grade = s.getGrade();
			int[] marks = new int[RANGE_OF_MARKS];
			marks[0] = mark1;
			marks[1] = mark2;
			if (searchBestStudents(grade, marks)) {
				result.add(s);
			}
		}
		return result;
	}

	private boolean searchBestStudents(int[] grade, int[] marks) {
		int minValue = minScore(marks);
		return searchBestMarks(grade, minValue);
	}

	private int minScore(int[] marks) {
		int minValue;
		minValue = marks[0];
		for (int a : marks) {
			if (a < minValue) {
				minValue = a;
			}
		}
		return minValue;
	}

	private boolean searchBestMarks(int[] grade, int mark) {
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] < mark) {
				return false;
			}
		}
		return true;
	}
}
