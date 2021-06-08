package lesson_2;

public class switch_ex1 {

	public static void main(String[] args) {
		
		int key = (int)(Math.random() *4)+1;
		System.out.println(key);
		
		switch (key) {
		
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("thursday");
			break;
		case 4:
			System.out.println("wendsday");
			break;
			
			default:
				System.out.println("the value " + key + " is not vialed");
		} 
				
	}

}
             