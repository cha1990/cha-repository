package lesson_3;

import java.util.Arrays;

public class array_3_2d_array {

	public static void main(String[] args) {

		int[][] matrix = new int[4][10];
		matrix[2][2] = 5;

		for (int i = 0; i < matrix.length; i++) {
			// i= num1 array
			for (int j = 0; j < matrix[i].length; j++) {
				// j= num2 array
				matrix[i][j] = (int) (Math.random() * 100);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}

	}

}
