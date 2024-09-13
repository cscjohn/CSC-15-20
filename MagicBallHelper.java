import java.io.*;
import java.util.*;
class MagicBallHelper{
  // takes in an empty array database
  // opens the file using try catch excption handlin
  // inputs a max of "SIZE" number of answers from the data file
  //keeps count of actual number of entries since file can have less than 20 entries
private static final int SIZE = 20;
public static int  readAnswers(String [] answers){
  // create a variable called count 
  // inititalize it to 0
  int count = 0;
    // create a Scanner and open a file called
    // "answers.txt"
try (Scanner scanner = new Scanner(new File("answers.txt"))) {
    // while there are lines in the file and
    // count has not exceeded the capacity of the array
    while (scanner.hasNextLine() && count < SIZE) {
        // use the length method of arrays
        // read the line from the file
        // store it into the answers array
        answers[count] = scanner.nextLine();
        // increment count
        count++;
    }
} catch (FileNotFoundException e) {
    System.out.println("Error: Data file Not Found");
}
return count;
}
// takes in the filled array database and the actual count of
// entries in the array
// repeatedly asks user for questions
// randomly indexes into the answers array
// displays the random response to the user
   public static void playGame(String []answers, int count){

  // create a string called input and intitialize it to ""
  String input = " ";
  // create a new Scanner to read from console
  Scanner inputScanner = new Scanner(System.in);
  //while the user does not enter "quit"// should be case insensitive
  //prompt user to enter question
  while (!input.equalsIgnoreCase("quit")) {
      //call the post reply method to randomly index into
      // the array and display random response to user
      System.out.println("Enter question (or type 'quit' to exit): ");
      input = inputScanner.nextLine();

         if (!input.equalsIgnoreCase("quit")) {
            postReply(answers, count);
      }
    }
    inputScanner.close();
  }
  


//takes in the filled database and count
// creates a random object and uses the nextInt method with count as parameter to create a random index
// uses this index to index into the array to display the random answer
public static void postReply(String [] answers, int count){
  //create random object
  Random random = new Random();
  // create a variable called randomIndex to get the next integer in the range 0..count-1
  int randomIndex = random.nextInt(count);
  //print the array entry at that index
  System.out.println("Magic 8-Ball says: " + answers[randomIndex]);
}
public static void main(String[] args) {
    String[] answers = new String[SIZE];
    int actualCount = readAnswers(answers);

    if (actualCount > 0) {
      playGame(answers, actualCount);
    } else {
      System.out.println("No answers loaded. Exiting.");
    }
  }
  }