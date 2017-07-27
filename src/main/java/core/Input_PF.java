package core;
import java.io.*;
import java.util.*;


public class Input_PF {

	public static void main(String[] args) throws IOException{
		
//		String file = "./input.properties";
		 String file = args[0];
		Properties p = new Properties();
		p.load(new FileInputStream(file));
		
		String fName = p.getProperty("f_name");
		String lName = p.getProperty("l_name");
		System.out.println("Full name is: " + fName + " " + lName);
	p.clear();
	}
	

}
