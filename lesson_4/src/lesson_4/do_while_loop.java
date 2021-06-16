package lesson_4;

import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {

		int password = 123;

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PASSWORD: ");
		int pinput = sc.nextInt();

		while (pinput != password) {
			System.out.println("ENTER PASSWORD AGAIN: ");
			pinput = sc.nextInt();

		}
		System.out.println("YOU ARE LOGGED IN");
		sc.close();

	}

}
