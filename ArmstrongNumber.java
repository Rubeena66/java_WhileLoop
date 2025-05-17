package com.Loops;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 123;
		int original = number;
		int count = 0;
		int sum = 0;
		int temp = number;

		while (temp > 0) {
			count++;
			temp /= 10;
		}
		temp = number;

		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, count);
			temp /= 10;
		}

		if (sum == original) {
			System.out.println(original + " is an Armstrong Number");
		} else {
			System.out.println(original + " is not an Armstrong Number");
		}
	}

}
