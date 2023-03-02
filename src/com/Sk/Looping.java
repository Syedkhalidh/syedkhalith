package com.Sk;

import java.util.Scanner;

public class Looping {
	public static void main(String[] args) {

		Scanner sk = new Scanner(System.in);
		System.out.print("Enter Which Number of Star Rows you Want: \n");
		int starrow = sk.nextInt();
		int a, b;
		for (a = 1; a <= starrow; a++) {
			for (b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (a = starrow; a >= 0; a--) {
			for (b = 2; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}