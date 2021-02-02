import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    int guesses = 13;
    boolean checker = true;
    String answer = RandomWord();
    System.out.println(answer);



    while (guesses > 0 && checker) {
      String guess = in.next();
      if (guess.equals(answer)) {
        checker = false;
      }
      else {
        guesses = guesses - 1;
        if (guesses > 1)
          System.out.println(guesses + " guesses left");
        else {
          System.out.println(guesses + " guess left");
        }
      }


    }
    if (guesses == 0) {
      System.out.println("You're out of guesses\n" + "The word was: " + answer);
    }
    else {
      System.out.println("You Guessed it!\n" + "The word was: " + answer);
    }
  }


  private static String RandomWord() {

    Scanner list = null;

    try {
      list = new Scanner(new File("RandomWord"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    String[] Word = new String[16];
    int count = 0;

    while(list.hasNext()) {
      Word[count] = list.next();
      count++;
    }
    int number = (int) (Math.random() * 16);
    return (Word[number]);

  }


}

