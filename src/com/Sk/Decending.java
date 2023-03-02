package com.Sk;

import java.util.Scanner;

public class Decending {

	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter The Number to Show Decending Order");
		int a = d.nextInt();
		for (a=a; a >= 0; a--) {
		System.out.println(a);
	}
}
}