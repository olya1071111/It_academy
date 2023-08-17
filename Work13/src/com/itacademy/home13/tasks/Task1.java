package com.itacademy.home13.tasks;

public class Task1 {

	public static void main(String[] args) {
		double x;
		double res;
		double res1;
		
		x = 0.5;
		
		res1 = Math.pow(Math.E, 2.2 * x);
		if (res1 < 0 || (x + (2.0 / 3.0)) == 0) {
			throw new RuntimeException("При данном значении х невозможно вычислить значение функции");
		}
		res = Math.sqrt(res1) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0)))) + 1.7;
		
		
		System.out.println("При х = " + x + " Значение функции F(x) = " + res);
		
	}

}
