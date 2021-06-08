package lesson_3;

import java.util.Arrays;

public class array_of_arrays_1 {

	public static void main(String[] args) {

		int[][] mmatrix = new int[3][5];

		// matrix build
		for (int i = 0; i < mmatrix.length; i++) {
			for (int j = 0; j < mmatrix[i].length; j++) {
			} // matrix build

			System.out.println(Arrays.toString(mmatrix[i]));

		}

	}

}
