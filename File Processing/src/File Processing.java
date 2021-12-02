/*John Carlo Cabanilla
 * Assignment No. 6
 * Syeda Daniya Nizami
 * File Processing
 */ 
 import java.util.*;

import java.io.*;
public class Assignment6 {
	public static void main(String[] args)
		throws FileNotFoundException{
		int line= 0;
		int word = 0;
		int totalword= 0;
		Scanner input = new Scanner (new File("words.txt"));
			while(input.hasNextLine()){
			String y = input.nextLine();
			//	System.out.println(y);
		Scanner lineWord = new Scanner(y);	
				while(lineWord.hasNext()){
					String x = lineWord.next();
				//	System.out.println(x);
					totalword = totalword + x.length();
					word++;
					
				}
			
				line++;
				
				
			}
		System.out.println("Number of lines: " + line);
		System.out.println("Number of words: " + word);
		System.out.println("Total Number of Characters: " + totalword);
		System.out.println("Average Number of words per line : " +(double) word/line);
		System.out.println("Average Number of Characters per line : " + (double)totalword/line);
		
		
		
		
		
		
		
		
		
		
		
	}
}
