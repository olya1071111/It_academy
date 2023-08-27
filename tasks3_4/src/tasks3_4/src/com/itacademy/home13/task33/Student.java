package com.itacademy.home13.task33;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private int numGroup;
	private String name;
	private final static int COUNT_OF_MARKS = 5;
	private int[] grade = new int[COUNT_OF_MARKS];

	public Student() {
	}

	public Student(int numGroup, String name, int[] grade) {
		super();
		this.numGroup = numGroup;
		this.name = name;
		this.grade = grade;
	}

	public int getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] grade) {
		this.grade = grade;
	}

	public static int getCountOfMarks() {
		return COUNT_OF_MARKS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grade);
		result = prime * result + Objects.hash(name, numGroup);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Arrays.equals(grade, other.grade) && Objects.equals(name, other.name) && numGroup == other.numGroup;
	}
	
}
