package expression_flow_control;

public class Ex_4 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int sum = x + y;
		double avr = sum / 2d;
		double reminderx = x / 10d;
		double remindery = y / 10d;
		int area = x * y;

		System.out.println("x= " + x + " , " + "y= " + y);
		System.out.println("the sum is= " + sum);
		System.out.println("the average is= " + avr);
		System.out.println("the reminder of x/10 is= " + reminderx);
		System.out.println("the reminder of y/10 is= " + remindery);
		System.out.println("the sq feet area of rectangle x,y is= " + area);
	}

}
