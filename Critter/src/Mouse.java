/*
* 
*
*
*
*/
import java.util.Random;

public class Mouse implements Critter {
   private int myDirection;
   private int myCount; 
   private int myZigDirection;
   private int myTarget;
   
   public char getChar() {

       return 'M';

   }

 
   public Mouse() {
      
      myDirection = EAST;
      myCount = 0;
      myZigDirection = 1; 
      myTarget = 1;
      
   }

   public int getMove(CritterInfo theInfo) {     
      Random rand = new Random();
      int randomDirection = rand.nextInt(4);
      int randomCount = rand.nextInt(6) + 1; 
                                       
      myCount++;
      if(myCount == myTarget) { 
         myZigDirection = randomDirection;            
         myTarget = randomCount; 
      }
     
          if(myZigDirection == 0) {
            if((myCount % 2) == 0) {
               myDirection = EAST;
            }else {
               myDirection = NORTH;
            }
          } else if(myZigDirection == EAST) {
               if((myCount % 2) == 0) {
               myDirection = WEST;
               }else {
               myDirection = NORTH;
               }
          } else if(myZigDirection == 2) {            
               if((myCount % 2) == 0) {
                  myDirection = WEST;
               }else {
                  myDirection = SOUTH;
               }
          } else if(myZigDirection == 3) {
               if((myCount % 2) == 0) {
                  myDirection = EAST;
               }else {
                  myDirection = SOUTH;
               }
          }
      
      
      return myDirection;
   }

}