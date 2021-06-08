package lesson_2;

public class booleani_ex2 {

	public static void main(String[] args) {
		
		int r = (int) (Math.random() *101);
		
		if  (r < 60) {
			System.out.println("fail");
			
		} else if (r==60) {
			System.out.println("pass");
		
		} else if (r<=90) {
			System.out.println("good");
			
		} else {
			System.out.println("excelent");
		}
				

	}

}
