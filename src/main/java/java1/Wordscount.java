package java1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wordscount {

	public static void main(String[] args) throws IOException {
		String line;
		int count=0;
		FileReader f= new FileReader("C:\\Users\\yaswanth\\Desktop\\sample.txt");
		BufferedReader br = new BufferedReader(f);
		while((line=br.readLine())!=null){
			String str[]=line.split("");
			 
			 System.out.println(str.length);
			
		}
		
		
br.close();
	}

}
