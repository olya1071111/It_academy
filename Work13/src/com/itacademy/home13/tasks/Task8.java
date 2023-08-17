package com.itacademy.home13.tasks;

public class Task8 {
	public static void main(String[] args) {
		int i;
		double x;
		double h;
		double fun;
		boolean f;

		h = 0.1;
		i = 1;
		x=0.1;

		System.out.println("---------------------------------------------------------");
		System.out.printf("|\t%2s\t|\t%2s\t|\t%8s\t|\n", "N", "X", "F");
		System.out.println("---------------------------------------------------------");

		// опеределим знак функции при начальном значении
		fun = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
		if (fun<0) {
			f=false;
		}else {
			f=true;
		}
		
		for (x = 0.1; x <= 10; x = x + h) {
			fun = Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
			System.out.printf("|\t%2d\t|\t%2.2f\t|\t%8.2f\t|\n", i, x, fun);
			if (fun < 0 && f==true) {
				break;
			}
			if (fun < 0 && f==false) {
				break;
			}
			i++;
		}
		System.out.println("---------------------------------------------------------");
	}
}
