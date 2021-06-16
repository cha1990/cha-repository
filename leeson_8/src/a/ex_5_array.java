package a;

import java.util.Arrays;

public class ex_5_array {

	public static void main(String[] args) {

		int[][] grades = new int[20][10];
		double studentSum = 0;
		double avgSum = 0;

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				grades[i][j] = (int) (Math.random() * 101);
				studentSum += grades[i][j];

			}
			double studentAvg = studentSum / grades[i].length;
			avgSum = +studentAvg;
			System.out.print("student " + (i + 1) + " grade:");
			System.out.print(Arrays.toString(grades[i]));
			System.out.println("avg: " + studentSum);

		}

		double schoolAvg = avgSum / grades.length;
		System.out.println("school avg: " + schoolAvg);

	}

}
