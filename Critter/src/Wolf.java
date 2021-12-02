
public class Wolf implements Critter {
	
	 public char getChar() {

	        return 'W';

	    }
   private int myDirection;
 
   private int myCount;
  
   private boolean myFirst;
  
   private int myTarget;
   

 
   public Wolf() {
   
      myDirection = EAST;
      myCount = 0;
      myFirst = true;
      myTarget = 1;
      
   }
 
   public int getMove(CritterInfo theInfo) {
      int direction = myDirection;
      myCount++;
      if(myCount == myTarget) {
         if(myFirst == false) {
            myTarget++;
         }
         if(myFirst == false) {
            myFirst = true;
         } else if(myFirst == true) {
            myFirst = false;
         }
         myCount = 0;
         if(myDirection == NORTH) {
            myDirection = EAST;
         } else if(myDirection == EAST) {
            myDirection = SOUTH;
         } else if(myDirection == SOUTH) {
            myDirection = WEST;
         } else if(myDirection == WEST) {
            myDirection = NORTH;
         }
      }
      return direction;
   }

}