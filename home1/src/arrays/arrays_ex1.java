package arrays;

public class arrays_ex1 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			sum += arr[i];
			System.out.print(arr[i] + " ,");

		}
		System.out.println();
		System.out.println("=======");
		System.out.println(sum);
	}

}
