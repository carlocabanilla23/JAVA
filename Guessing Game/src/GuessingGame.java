/*John Carlo Cabanilla
 * CSI 142
 * Nizami Syeda
 * Assignment No.5 
 * Guessing Game.
 * */


import java.util.*;
public class GuessingGame {
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);

	String Play = "Y";
	 int totalcount = 0;
	 int game= 0;
	 int best = 1000000;
	while (Play.equalsIgnoreCase("Y")|| Play.equalsIgnoreCase("Yes")||Play.equalsIgnoreCase("Yeah")){
		System.out.println("Guessing Game ~!");
		game++;
		Random Num = new Random();
		int guess = Num.nextInt(10)+1;
		//System.out.println(guess);
		System.out.println("Enter A Number");
		int x = console.nextInt();
		int count = 1;
		 while (x != guess){
			 count++;
			 if (x > guess){
				 System.out.println("Enter A Lower Number");
				 x = console.nextInt();
			 }else{
				 System.out.println("Enter A Higher Number");
				  x = console.nextInt();
				 
				 
			 }
			 
			 
			
			 
		 }
		 System.out.println("You tried " + count + " times");
		
		 if (count < best){
			 best = count;
			 
		 }
		 
		 totalcount = totalcount+count;
		System.out.println("Enter A You want to play again?");
		Play = console.next();
		
	}
	double average = totalcount/game;
	System.out.println("Total Tries: "+ totalcount);
	System.out.println("Total Games: "+ game);
	System.out.println("Average Guess: " + average);
	System.out.println("Best Guess: " + best);
	
	console.close();
	
	}


}
