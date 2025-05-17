package com.Loops;

public class FactorialNumber {
	public static void main(String[] args) {
		int n = 7;
		int result = 1;
		int i = 1;

		while (i <= n) {
			result = result * i;
			i++;
		}
		System.out.println("Factorial of " + n + " is " + result);
	}
}