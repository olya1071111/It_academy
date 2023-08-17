package com.itacademy.home13.tasks;

public class Task6 {

	public static void main(String[] args) {
		int n;
		int a1;
		int b1;
		int h;

		double a;
		double b;
		int m;

		double t1;
		double t2;
		double t3;
		double t4;

		n = 20;
		a1 = -30;
		b1 = 30;
		h = (b1 - a1) / n;

		a = 3 * Math.pow(10, 3);
		b = 6 * Math.pow(10, 4);
		m = 4;

		t1 = Math.sqrt(a + b + m);
		t2 = Math.sqrt(a + b) * m;
		t3 = Math.sqrt(a * b * m);
		t4 = Math.sqrt(a * b) * m;

		int k = a1;
		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%s\t|\t%2s\t|\t%2s\t|\n", "N", "k", "f(k)");
		System.out.println("-------------------------------------------------");

		for (int i = 1; i <= n; i++) {
			int res;
			res = (int) Math.pow(k, 3) - 25 * k * k + 50 * k + 1000;

			if ((res > t1 && res < t2) || (res > t3 && res < t4)) {
				System.out.printf("|\t%d\t|\t%d\t|\t%d\t|\n", i, k, res);
			}
			k = k + h;
		}
		System.out.println("-------------------------------------------------");
	}
}
