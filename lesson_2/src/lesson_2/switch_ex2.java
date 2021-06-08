package lesson_2;
import java.util.Scanner;

public class switch_ex2 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter mode: [ON, OFF, STANDBY]");
		String machinemode = sc1.nextLine();
		sc1.close();
		
		switch (machinemode) {
		
		case "ON":
			System.out.println("the machine is ON mode");				
		break;
		
		case "OFF":
			System.out.println("the machine is OFF mode");				
			break;
			
		case "STANDBY":
			System.out.println("the machine is STANDBY mode");				
			break;
			
			default:
				System.out.println("the mode " + machinemode + "is not valid");
			break;	
		}
		
		
	}

}
