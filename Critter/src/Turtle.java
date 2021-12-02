
import java.util.Random;


public class Turtle implements Critter {
 
   private int myTotalMoves;
 
   private int myDirection;
   
   public char getChar() {

       return 'T';

   }


  
   public Turtle() {
     
      myTotalMoves = 0;
      myDirection = NORTH;
      
   }
  
   public int getMove(CritterInfo theInfo) {
      Random rand = new Random();
      boolean random2 = false;
      int random1 = 0;
      int randomKeeper2 = rand.nextInt(2) + 1; // 1,2
      int randomKeeper1 = rand.nextInt(4); // 0,1,2,3
      myTotalMoves++;
      if((myTotalMoves % 3) == 0) {
       
         if(randomKeeper2 == 1) {
            random2 = false;
         }else {
            random2 = true;
         }
      
         if(random2 = false) {      
            if(random1 == 0) {
               myDirection = NORTH;
            }else if(random1 == 1) {
               myDirection = EAST;
            }else if(random1 == 2) {
               myDirection = SOUTH;
            }else if(random1 == 3) {
               myDirection = WEST;
            }
         }else {
            if(random1 == 0) {
               myDirection = SOUTH;
            }else if(random1 == 1) {
               myDirection = WEST;
            }else if(random1 == 2) {
               myDirection = NORTH;
            }else if(random1 == 3) {
               myDirection = EAST;
            }
         }
      }else { 
         myDirection = CENTER;
      }
      return myDirection;
   }
}