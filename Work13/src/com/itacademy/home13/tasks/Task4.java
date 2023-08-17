package com.itacademy.home13.tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int i;
		int kol;
		int n;
		double x;
		double y;
		boolean f;

		i = 1;
		kol = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество точек для проверки");
		System.out.print("n = ");
		n = sc.nextInt();
		System.out.println("---------------------------------------------------");
		while (i <= n) {
			sc.nextLine();
			System.out.println("Координаты точки:");
			System.out.print("x = ");
			x = sc.nextDouble();

			sc.nextLine();
			System.out.print("y = ");
			y = sc.nextDouble();

			f = false;
			if (x >= -2 && x <= 2 && y >= -1 && y <= 2) {
				f = true;
			} else {
				f = false;
			}

			if (f == true) {
				kol++;
				System.out.println("Точка приналежит заданной области");
			} else {
				System.out.println("Точка НЕ приналежит заданной области!");
			}
			i++;
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Количество точек попавших в заданную область = " + kol);
		System.out.println("Программа завершена!");
	}
}
