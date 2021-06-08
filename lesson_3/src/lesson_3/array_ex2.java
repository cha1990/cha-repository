package lesson_3;

import java.util.Scanner;

public class array_ex2 {

	public static void main(String[] args) {

		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name=");
		names[0] = sc.nextLine();
		System.out.println("enter name=");
		names[1] = sc.nextLine();
		System.out.println("enter name=");
		names[2] = sc.nextLine();
		System.out.println("enter name=");
		names[3] = sc.nextLine();
		System.out.println("enter name=");
		names[4] = sc.nextLine();

		for (int i = 0; i < names.length; i++) {
			System.out.println();
		}
	}

}
