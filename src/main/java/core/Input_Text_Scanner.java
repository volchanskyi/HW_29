package core;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input_Text_Scanner {

	public static void main(String args[]) throws FileNotFoundException{
//		String file = args[0];
		File file = new File("input.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			String fName = scan.next();
			String lName = scan.next();
			System.out.println("Full name is: " + fName + " " + lName);
		}
			scan.close();
		
	}

}
