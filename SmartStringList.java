/**
*@author John Vue
*
*/

import java.util.Arrays;
public class SmartStringList{
/**
*Contains the private variables used to 
*make the array internally.
*Don't want the external code to
*directly interfere with the internal objects.
*
*/
   private String[] strings;
   private int size;
   private int capacity;
   private boolean sorted;
   
   public SmartStringList(int capacity){
   /**
   *Contructor code, initializes the instance
   *variables of the class.
   *
   *
   */
      /**
      *Assigns the value of the "capacity" parameter passed to the constructor to the 
      *"capacity" instance variable of the object SmartStringList. 
      *The max number of elements the list can hold.
      *
      */
      this.capacity = capacity; 
      this.strings = new String[capacity]; //Creates a new array of String objects with length equal to "capacity"
      this.size = 0; //Initializes the "size" instance variable to 0. Keeps track of current number of elements in the list.
      this.sorted = true; //List is considered sorted from the start, since the list is empty.
   }
   
   public void add(String s){
   /**
   *@param String s 
   *Add method, adds parameter String s to the list
   *
   */
      //Checks if the size is less than the capacity to see if there is enough space to add another string
      if(size < capacity){
         /**
         *Checks if the list is not empty and not sorted 
         *also checks if the new added String s is smaller than the last string
         *that was added. If all these are true then the list is not sorted. 
         *
         */
         if(size > 0 && !sorted && s.compareTo(strings[size-1]) < 0){ 
            sorted = false; //This means the list is no longer sorted.
         }
         strings[size++] = s; //Adds String s to the end of the list then updates the size of the list.
      }else{
         System.out.println("This list is full and you cannot add more strings."); //If size > capacity then the list is full.
      }
   }
   
   /**
   *Get method. Takes the parameter i = index of the string to get and return string.
   *Checks the ranges for the index. If it is within range 
   *@return String at index i or if it is an invalid range error message is printed
   *
   */
   public String get(int i){ 
      if(i >= 0 && i < size){ //Checks if index i is in range of indexes for the list. 0 to size - 1.
         return strings[i];   //Size is the number of elements stored in the list. Returns string that is stored in the returned index.
      }else{
         System.out.println("Index is out of range"); //If the index is less than 0 or greater than or equal to size
         return null;                                 //return null
      }
   }
   /**
   *Finds the index of given string 's' in the list.
   *If sorted binary search, else linear search.
   *@parameter String s that is searched for in the list
   *@return int as index of the string in the list, 
   *@return -1 string isn't in the list
   *
   */
   public int indexOf(String s){ 
         //Binary Search
         int min = 0;
         int max = size - 1;
         while(max >= min){      //While the index of max is >= index of min. Iterates until String s is found or range becomes empty
            int mid = min + (max - min)/2; //Calculates the middle index 
            int cmp = strings[mid].compareToIgnoreCase(s); //Compares the string in the middle index with the target String. 
            if(cmp == 0){        //If comparison is equal to 0 then thats the middle
               return mid;
            }else if(cmp < 0){   //If the comparison is negative, String s > middle index, so range is changed to upper half of indexes
               min = mid + 1;
            }else{               //If positive, String s < middle index, range of search changed to lower half of indexes
               max = mid - 1;    
            }
      }
      return -1;                 //Couldn't find the index and String s in the list, exits loop
   }
   /**
   *Selection sort algorithm sorts the elements of the list in ascending order.
   *Iterates through the list, finds the smallest element and moves it to the 
   *correct position until the entire list is sorted
   *
   */
   public void sort(){
      int n = size;      //Checks if list isn't sorted yet, if false it means list needs to be sorted. 
      //Selection Sort
         for(int i = 0; i < n - 1; i++){ //Iterates through the list from index 0, to size - 1.
            int minIndex = i;               //Sets the smallest index to the current index i
            for(int j = i + 1; j < n; j++){ //Starts from the next index and iterates through the list to find the index of the smallest element
               if(strings[j].compareToIgnoreCase(strings[minIndex]) < 0){ //Compares new index j to minIndex, updates minIndex to j, says that j is the smallest index now
                  minIndex = j;
               }
            }
            /*
            *Finds the index of the smalles element in the part of the list thats unsorted
            *then swaps the elements at minIndex and i. Moves smallest element to it's correct position
            */
            String temp = strings[i];
            strings[i] = strings[minIndex];
            strings[minIndex] = temp;
         }
         sorted = true; //List is sorted now
      
   }
   
   public static void main(String[] args){
      SmartStringList list = new SmartStringList(5); //creates smartstringlist object
      list.add("Bulbasaur");                          //adds strings to the list
      list.add("Arcanine");
      list.add("Eevee");
      list.add("Charmander");
      list.add("Dragonair");
      
      System.out.println("Unsorted List:");  //list before it is sorted
        for (int i = 0; i < list.size; i++){ //iterates through the size of the list 
            System.out.println("Index " + i + ": " + list.get(i));
        }
      list.sort(); //sort the list
      System.out.println("\nSorted List:"); //list after sorting
        for(int i = 0; i < list.size;i++){  //iterates through the size of the list
            System.out.println("Index " + i + ": " + list.get(i));
        }
      //indexOf
      System.out.println("\nIndex of Arcanine: " + list.indexOf("Arcanine")); // Output: 0
      System.out.println("Index of Bulbasaur: " + list.indexOf("Bulbasaur")); // Output: 1
      System.out.println("Index of Charmander: " + list.indexOf("Charmander")); // Output: 2
      System.out.println("Index of Flareon: " + list.indexOf("Flareon")); // Output: -1 (not found)
      
      System.out.println("Sorted list: " + Arrays.toString(list.strings)); 
   
   }
}   