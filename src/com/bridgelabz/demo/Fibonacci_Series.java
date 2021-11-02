package com.bridgelabz.demo;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		int i;
		System.out.println(" Enter the number upto Fibonacci Series we want : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.print(+a + " " + b);

		for (i = 2; i < count; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}
}
