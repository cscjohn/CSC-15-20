/*
John Vue
1/31/2024
CSC20
Program that reads tokens from file data.txt and prints the integer
tokens found in it to the screen in increasing order.
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
 
public class FilterSort{
   public static int[] doubleArrayAndCopy(int[] arr){
   //use the length method to get the size of arr
   int length = arr.length;
   //create a temp array that is double the size of arr
   int[] temp = new int [arr.length*2];
   //store the elements of the arr into temp array using a for loop
      for(int i=0; i<temp.length; i++){
      temp[i]=arr[i];
      }
      //return temp array
      return temp;
   }
   public static void main(String[] args){
   int[] data = new int [8];
      try{
      //create scanner and open a file called data.txt
         Scanner console = new Scanner(new File("data.txt"));
         //initialize index = 0
         int index = 0;
         //while there are lines in the file
         while(console.hasNextInt()){
            //read line from the file (get tokens)
            //check if the token is an integer or not
            if (console.hasNextInt()){
               int token = console.nextInt();
               data[index] = token;
               index++;
            }else{
               console.next();
                  if(data.length <= index){   
                     data = doubleArrayAndCopy(data);
                  }
            }
         }
         console.close();
         if(index==0){
            System.out.println("There is no data in this file.");
         }
               else{
                  Arrays.sort(data);
                     for(int i=0; i<index; i++){
                        System.out.println(data[i]);
                     }   
               }
               
      }
      catch(FileNotFoundException e){
         System.out.println("Error: Data file not found.");
      }
      
   }
   
}