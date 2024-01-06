package Exception_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Checked {
public static void main(String args[]) throws IOException{
		
		File file = null;
		boolean isFileCreated = false;
		FileWriter writer = null;
		
			file = new File("/Users/mallinath/Documents/"
					+ "workspace-spring-tool-suite-4-4.18.1.RELEASE/"
					+ "Demo/src/ExcpetionExamples/FileCreatedByMe3.java");
		
			isFileCreated = file.createNewFile();
		
				
	
		if(isFileCreated) {
			writer = new FileWriter(file);
			System.out.println("Writing to the file");
			
			writer.write("public class FileCreatedByMe2 { \n "
					+ "public static void main(String args[]){ \n} \n}");
			writer.close();
			System.out.println("File created AT: "+ file.getAbsolutePath());	
		}
		
		
		System.out.println("File reading started.....");				
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				
				System.out.println(sc.nextLine());
				
			}

		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	

		
		}
}
/*
 * 1. WAP to read excel sheet and print on console
 * 2. 
 * 
 */
