package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AuthModel {
	
	public boolean login (String email, String password) {
		
		String url=this.getClass().getResource("/File/user.txt").getPath();
		BufferedReader reader;
		try {
			   reader = new BufferedReader(new FileReader("/File/user.txt"));
			   String line = reader.readLine();

			   while (line != null) {
			    System.out.println(line);
			    
			    line = reader.readLine();
			   }

			   reader.close();
			  } catch (IOException e) {
			   e.printStackTrace();
			  }
		return false;
		
	}
	
	

}
