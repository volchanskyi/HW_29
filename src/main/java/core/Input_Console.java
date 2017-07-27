package core;
import java.io.Console;

public class Input_Console {
	public static void main(String[] args) {
		
		Console terminal = System.console();
		
		if(terminal == null) {
			System.err.println("Console is not available"); System.exit(0);
		}
		// System.out.print"(Enter your first name: ");
		String fName = terminal.readLine("Enter your first name: ");
		String lName = terminal.readLine("Enter your last name: ");
		System.out.println("Your full name is: " + fName + " " + lName);
	}

}
