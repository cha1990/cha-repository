package lesson_3;

public class array_of_arrays_2 {

	public static void main(String[] args) {

		char[][] cinema = new char[3][5];
		populate(cinema);
		print(cinema);

	}

	// fill the matrix with empty seat- 0 character
	public static void populate(char[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = '0';

			}
		}
	}

	// print the matrix
	public static void print(char[][] cinema) {
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j] + " ");
			}

			System.out.println();
		}
	}

}
