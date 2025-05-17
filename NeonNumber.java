package com.Loops;

public class NeonNumber {
	public static int squareNumber(int n) {
		return n * n;
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void isNeonNumber(int n) {
		int square = squareNumber(n);
		int digitSum = sumOfDigits(square);
		if (digitSum == n) {
			System.out.println(n + " is a Neon Number");
		} else {
			System.out.println(n + " is not a Neon Number");
		}
	}

	public static void main(String[] args) {
		isNeonNumber(9);
	}
}