package lesson_4;

import java.util.Scanner;

public class do_while_loop2 {

	public static void main(String[] args) {

		int password = 123;
		Scanner sc = new Scanner(System.in);

		int pinput = 0;

		do {
			System.out.println("ENTER PASSWORD: ");
			pinput = sc.nextInt();

		} while (pinput != password);

		System.out.println("YOU ARE LOGGED IN");
		sc.close();

	}

}
