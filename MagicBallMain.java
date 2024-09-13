class MagicBallMain {
  // size of the answers array database
  // SIZE is the maximum number of elements
  // the answers file can have more or less than SIZE
  // this way we can have a minimum of 0 and max of SIZE and any in between

  public static final int SIZE = 20;

  public static void main(String[] args) {
    // create the empty answers array database
    String [] answers = new String[SIZE];
      // fill answers array database
      // count holds the actual number of entries in the array 
    int count=MagicBallHelper.readAnswers(answers);
    // play the game until user enters "quit"
    //note the array and count are passed into the game
    MagicBallHelper.playGame(answers,count);
    
  }
}