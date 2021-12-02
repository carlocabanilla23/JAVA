import java.util.Random;

public class Frog implements Critter {
  
   private int myDirection;
 
   private int myCount;  
 
   public char getChar() {

       return 'F';

   }
   public Frog() {
      myDirection = EAST;
      myCount = 0;
      
   }
  
   public int getMove(CritterInfo theInfo) {
     
      int result = 0;
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
      myCount++;
      if(myCount == 3){
         myCount = 0;
      }
      if(theInfo.getNeighbor(myDirection) == 'S') {
          result = CENTER; 
      }else{
          result = myDirection;
      }      
      return result;
   }

}