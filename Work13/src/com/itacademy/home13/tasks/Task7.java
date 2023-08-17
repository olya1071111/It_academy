package com.itacademy.home13.tasks;

public class Task7 {

	public static void main(String[] args) {
		int n;
		int m;
		double x1;
		double z1, z;
		double hx;
		double hz;
		double res;
		double znam;

		n = 5;
		m = 10;

		x1 = 5;
		z1 = 1;

		hx = 0.5;
		hz = 0.2;

		if (x1 <= Math.sqrt(z1 * z1 - 3.2)) {
			throw new RuntimeException("Начальные параметры заданы неверно!");
		}
		System.out.println("-------------------------------------------------");
		System.out.printf("|\t%s\t|\t%2s\t|\t%2s\t|\n", "X", "Z", "F(X,Z)");
		System.out.println("-------------------------------------------------");
		z = z1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				znam = Math.sqrt(x1 * x1 - z1 * z1 + 3.2);
				if (znam == 0) {
					throw new RuntimeException("Ошибка деления на ноль!");
				}
				res = Math.sqrt(z1 * z1 + x1 * x1) * Math.log(z1) + (Math.abs(Math.log(z1))) / znam;
				System.out.printf("|\t%3.3f\t|\t%3.3f\t|\t%3.3f\t|\n", x1, z1, res);
				z1 = z1 + hz;
			}
			z1 = z;
			x1 = x1 + hx;
			System.out.println("-------------------------------------------------");
		}
	}
}
