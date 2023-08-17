package com.itacademy.home13.tasks;

public class Task2 {

	public static void main(String[] args) {
		int n;
		double a;
		double b;
		double h;

		double res;
		double res1;

		n = 10;
		a = 0.5;
		b = 1.0;
		h = (b - a) / n;

		if (n <= 0 || b < a) {
			throw new RuntimeException("При заданных первоначальных значениях невозможно вычислить значение функции");
		}

		System.out.println("-----------------------------------------------------------------");
		System.out.printf("|\t%s\t|\t%2s\t\t|\t%2s\t\t|\n", "N", "x", "f(x)");
		System.out.println("-----------------------------------------------------------------");

		for (int i = 1; i <= n; i++) {
			res1 = Math.pow(Math.E, 2.2 * a);

			if (res1 < 0 || (a + (2.0 / 3.0)) == 0) {
				throw new RuntimeException("При данном значении х невозможно вычислить значение функции");
			}
			res = Math.sqrt(res1) - Math.abs(Math.sin((Math.PI * a) / (a + (2.0 / 3.0)))) + 1.7;
			System.out.printf("|\t%d\t|\t%3.6f\t|\t%3.6f\t|\n", i, a, res);
			a = a + h;
		}
		System.out.println("-----------------------------------------------------------------");

	}

}
