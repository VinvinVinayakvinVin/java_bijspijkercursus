package com.javaBijspijkeren.vinayak.h4.opdracht7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @version v1.0
 * @author vinayak
 * @since 10-01-2020
 */
public class Opdracht4_7 {
	
	private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	private static String land[] = new String[3];
	
	public static void main(String[] args) {
		System.out.println("Land 1: ");
		land[0] = sc.nextLine();
		System.out.println("Land 2: ");
		land[1] = sc.nextLine();
		System.out.println("Land 3: ");
		land[2] = sc.nextLine();
		
		Arrays.sort(land);
		System.out.println(land[0] + " - " + land[1] + " - "
				+ land[2]);
		
		sc.close();
	}
}
