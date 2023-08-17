package com.itacademy.home13.tasks;

public class Task5 {

	public static void main(String[] args) {
		int n;
		double a;
		double x;
		double h;
		double res;
		double res1;

		n = 20;
		a = 1.0;

		x = -2.0 * a;
		h = a / 5.0;

		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%s\t|\t%2s\t|\t%2s\t|\n", "N", "x", "Y(x)");
		System.out.println("-------------------------------------------------");

		for (int i = 1; i <= n; i++) {
			if (x <= 0) {
				res = a / 2.0 * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
			} else {
				res1 = x * x + 4.0 * a * a;
				if (res1 == 0) {
					throw new RuntimeException("При данном значении x невозможно вычислить значение функции");
				}
				res = (4 * Math.pow(a, 3)) / res1;
			}
			System.out.printf("|\t%d\t|\t%3.3f\t|\t%3.3f\t|\n", i, x, res);
			x = x + h;
		}
		System.out.println("-------------------------------------------------");

	}
}
