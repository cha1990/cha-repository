package lesson_2;

public class ex_2 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random() *11);
		int b = (int)(Math.random() *11);

		int sum = a + b;
		
		double avr = sum/2d;
		
		int area = a * b ;
		
		
		System.out.println("a =" + a + "b =" + b);
		System.out.println(sum);
	    System.out.println(avr);
	    System.out.println("the remainder of a/10 :"+(a%10));
	    System.out.println("the remainder of b/10 :"+(b%10));
	    System.out.println("the area of " + a + "*" + b + "=" +area);
	    
	    
	    
	    
	    
		

	}

}
