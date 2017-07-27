package core;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Input_ISR {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter your first name: ");
		String fName = bReader.readLine();
		
		System.out.println("Enter your first name: ");
		String lName = bReader.readLine();
		
		System.out.println("Your full name is: " + fName + " " + lName);
		bReader.close();
	}

}

