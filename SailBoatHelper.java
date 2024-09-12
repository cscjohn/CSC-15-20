/*
John Vue
CSC 15-15
9/8/2023
A helper class that draws a sailboat meant to be called in the main method.
*/

public class SailBoatHelper{

public static void main(String[] args){
   drawSailBoat();
}
//splits the program in three pieces
public static void drawSailBoat(){
   drawSail();
   drawBoat();
   drawWater();
}
//draws the sail
public static void drawSail(){
   drawOne();
   drawTwo();
   drawThree();
   drawFour();
   drawFive();
   drawSix();
}
public static void drawOne(){
      System.out.println("      *");
      }
public static void drawTwo(){
      System.out.println("      **");
      }
public static void drawThree(){
      System.out.println("      ***");
      }
public static void drawFour(){
      System.out.println("      ****");
      }
public static void drawFive(){
      System.out.println("      *****");
      }
public static void drawSix(){
      System.out.println("      ******");
      }
public static void twelveDashes(){
   System.out.println("------------");
   }
public static void eightDashes(){
   System.out.println("  --------  ");
   }
//draws the boat
public static void drawBoat(){
   twelveDashes();
   topBoat();
   botBoat();
   eightDashes();
}
public static void topBoat(){
      System.out.println("\\          /");
      }
public static void botBoat(){
      System.out.println(" \\        /");
      }
//draws the water
public static void drawWater(){
   twelveDashes();
   twelveDashes();
   }
}