package files;

import java.io.*;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {
		//creating an object of our own filehandling class
		FileOperation myfileop=new FileOperation("myfile2.txt");
		
		myfileop.createFile();
		myfileop.WritetoFile();
		myfileop.readFile();
		// TODO Auto-generated method stub
		//Creating file with java File object
		File myfile=new File("MyFile.txt");
		try {
		myfile.createNewFile();
		}
		catch(IOException e) {
			System.out.println("An error ocurred");
		}
		//Any file operation needs a try-catch block
		try {
			//writing to a file using FileWriter class from java.io package 
		FileWriter mywriter= new FileWriter("MyFile.txt");
		mywriter.write("This is terrible!");
		mywriter.write("This is terrible!");
		mywriter.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		
		try {
		Scanner myReader =new Scanner(myfile);
		 while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		}
		catch(IOException e) {
			System.out.println("Error");
		}
		
	}

}
