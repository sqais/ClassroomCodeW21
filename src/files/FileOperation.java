package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
	private String filename;
	
	public FileOperation(String fname) {
		filename=fname;
	}
	public void createFile() {
	try {
		      File myObj = new File(filename);
		     //checks whether the file created correctly
		      try {
			     
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      //e.printStackTrace();
			    }
		   
	}catch(Exception e) {
		System.out.println("Error found");
	}
 }
	public void WritetoFile() {
		try {
		      
		    FileWriter myWriter = new FileWriter(filename);
		      
		      myWriter.write("File is not fun!");
		      myWriter.write("Second line.");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
	}
	public void readFile() {
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
	}
}
