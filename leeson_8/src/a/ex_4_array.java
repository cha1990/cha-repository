package a;

import java.util.Arrays;

public class ex_4_array {

	public static void main(String[] args) {
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr1));

		int[] arr2 = new int[10];
		for (int i = 0, j = 9; i < arr2.length; i++, j--) {
			arr2[i] = arr1[j];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
