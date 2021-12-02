
import java.util.Random;

public class Bird implements Critter {

	
	  public char getChar() {

	        return 'B';

	    }
	
	
	public int getMove(CritterInfo info) {
		 Random rand = new Random();
	      int direction = 0;
	      int random = rand.nextInt(4); 
	      if(random == 0) {
	         direction = NORTH;
	      } else if(random == 1) {
	         direction = WEST;
	      } else if(random == 2) {
	         direction = SOUTH;
	      } else if(random == 3) {      
	         direction = EAST;
	      }
	   
	      return direction;
	}

  

}