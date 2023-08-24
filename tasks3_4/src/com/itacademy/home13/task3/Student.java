package com.itacademy.home13.task3;

public class Student {
	private int numGroup;
	private String name;
	private int[] mas = new int[5];
	
	public Student() {}
	
	public Student(int numGroup, String name, int[] mas) {
		super();
		this.numGroup = numGroup;
		this.name = name;
		this.mas = mas;
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

	public int[] getMas() {
		return mas;
	}

	public void setMas(int[] mas) {
		this.mas = mas;
	}

	
}
