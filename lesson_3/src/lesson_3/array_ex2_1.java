package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class array_ex2_1 {

	public static void main(String[] args) {

		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("enter name=");
			names[i] = sc.nextLine();

		}

		sc.close();

		System.out.println("the names are:" + Arrays.toString(names));

	}

}
