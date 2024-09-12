/*
John Vue
CSC15-15
10/12/23
Use static methods to accurately capture the structure of the output in this program as well as reducing redundancy by implementing for loops.
Implement a class constant to represent the size of the figure that is outputted and another class constant to represent the number of times the 
figure is repeated.
*/
public class HourGlassHelper{
public static final int SIZE = 6;
public static final int TIMES = 5;
   public static void main(String[] args){
      drawBaseHourGlass();
   }
//static method that calls to draw the top and bottom part of the hourglass as well as the ends
//uses a for loop to implement the class constant TIMES, the number of times the hourglass drawing should be repeated
      public static void drawBaseHourGlass(){
         drawHourGlassEnds();
         for(int i=0; i<TIMES; i++){
            drawTopHourGlass();
            drawBotHourGlass();
         }
         drawHourGlassEnds();
      }
//static method that calls the ends of the hourglass
      public static void drawHourGlassEnds(){
         System.out.print("+");
         for(int i=-1; i<=SIZE-2; i++){
            System.out.print("-");
         }
         System.out.println("+");
      }
//static method that calls the top part of the hourglass
      public static void drawTopHourGlass(){
         for(int line=1; line<=SIZE/2; line++){
            System.out.print("|");
            for(int i=1; i<=(line-1); i++){
               System.out.print(" ");
            }
            System.out.print("\\");
            for(int i=1; i<=(SIZE-2*line); i++){
               System.out.print(".");
            }
            System.out.print("/");
            for(int i=1; i<=(line-1); i++){
               System.out.print(" ");
            }
            System.out.println("|");
         }
      }
//static method that calls the bottom part of the hourglass
      public static void drawBotHourGlass(){
         for(int line=1; line<=SIZE/2; line++){
            System.out.print("|");
            for(int i=1; i<=(SIZE/2-line); i++){
               System.out.print(" ");
            }
            System.out.print("/");
            for(int i=1; i<=2*(line-1); i++){
               System.out.print(".");
            }
            System.out.print("\\");
            for(int i=1; i<=(SIZE/2-line); i++){
               System.out.print(" ");
            }
            System.out.println("|");
         }   
      }
}   
