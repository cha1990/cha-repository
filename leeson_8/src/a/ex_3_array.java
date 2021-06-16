package a;

import java.util.Arrays;

public class ex_3_array {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));

		int[] temp = new int[arr.length];
		System.out.println(Arrays.toString(temp));

		// start moving elements
		int length = 0;
		outer: for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr[i] == temp[j]) {
					continue outer;

				}
			}
			// if we are here we should copy an element
			temp[length] = arr[i];
			length++;
		}
		System.out.println(Arrays.toString(temp));

		// shorting the temp array
		int[] arrUniqe = new int[length];
		System.out.println(Arrays.toString(arrUniqe));

		// copy
		System.arraycopy(temp, 0, arrUniqe, 0, length);
		System.out.println(Arrays.toString(arrUniqe));
	}

}
