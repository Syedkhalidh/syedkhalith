package com.Scanner_Sample;

import java.util.Scanner;

public class Tables {
	public static void main( String args[] ) {

		Scanner t = new Scanner(System.in);
		System.out.print("Enter The Table You Want: \n");
		int table = t.nextInt();
		System.out.print("Enter The Range of Table You Want: \n");
		int range = t.nextInt();
		System.out.print("\nTable of "+table+" is Given Below\n");		
		for (int a = 1; a <= range; a++) {
			System.out.println(table + " x " + a + "\t = " + table * a);
		}
	}

}