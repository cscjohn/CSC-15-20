/*
John Vue
CSC15-15
This helper class calls methods for the main method. It contains the for loop.
*/

public class SongVueHelper{

   public static final int NUM_BOTTLES = 10; 

public static void main(String[] args){
   lyrics();
}

public static void lyrics(){
//code the for loop
//make sure to use the constant that was set at the beginning
   for(int i=NUM_BOTTLES; i >=2; i--) {
      System.out.print(i + " bottles of the Juice on the wall, " +i+ " bottles of juice");
      System.out.println();
      System.out.println("Take one down and pass it around, " +(i-1)+ " bottles of juice on the wall.");
      }
      System.out.println("1 bottle of the juice on the wall, 1 bottle of the juice");
      System.out.println("Take one down and pass it around, no more bottles of juice on the wall.");
      System.out.println("Go to the store and buy some more, " + (NUM_BOTTLES-1) + " bottles of juice on the wall.");
      
}    
}