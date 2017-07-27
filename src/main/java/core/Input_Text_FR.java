package core;
import java.io.*;


public class Input_Text_FR {

	public static void main(String[] args) throws IOException{
		String file = args[0];
		
//		String file = "D:\\projects\\Workspace\\HW_28\\extFiles\\input.txt";
//		File file1 = new File(file1);
		BufferedReader bReader = new BufferedReader(new FileReader(file));
		while (bReader.ready()) {
			String fName = bReader.readLine();
//			String lName = bReader.readLine();
			System.out.println("Full name is: " + fName + " " );
		}
			bReader.close();
		
	}
}
