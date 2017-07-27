package core;
import java.io.*;
import java.util.Arrays;

import sun.security.util.Password;


public class Input_Console_Password {

	public static void main(String[] args) {
		
		Console term = System.console();
		
		if (term == null) {
			System.err.println("Console is not available"); System.exit(0);
		}
		char[] pwd = term.readPassword("Password: ");
		char[] pwdConfirmation = term.readPassword("Confirm the password: ");
		boolean isMatch = Arrays.equals(pwd, pwdConfirmation);
		System.out.println(isMatch ? "Password match" : "Passwords dont match");
		System.out.println("Password: " + String.valueOf(pwd));
		System.out.println("Confirm password: " + String.valueOf(pwdConfirmation));

	}

}
