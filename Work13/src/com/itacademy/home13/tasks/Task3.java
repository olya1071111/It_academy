package com.itacademy.home13.tasks;

public class Task3 {

	public static void main(String[] args) {
		double x;
		int n;
		double sum = 0;

		x = 0.5;
		n = 20;

		for (int k = 1; k <= n; k++) {
			sum += (Math.sin((k * x) / 2.0) + Math.sin((k * x - 1) / 2.0)) / Math.pow(Math.E, (x - 1) / k);
		}
		sum = sum * Math.sqrt(n * Math.PI);

		System.out.println("При х = " + x + " Значение функции F(x) = " + sum);

	}

}
