package core;
import java.util.Scanner;


public class Input_Scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fName = scan.nextLine();
		System.out.println("Enter your last name: ");
		String lName = scan.nextLine();
		System.out.println("Your full name is: " + fName + " " + lName);
		scan.close();

	}

}
