import java.util.Scanner;

public class HangmanMethodTesting {
  public static void main(String [] args) {
    Guesser(guesses);


    if (guesses == 0) {
      System.out.println("You're out of guesses");
    }
    else {
      System.out.println("You Guessed it!");
    }
  }

  private static void Guesser() {
    Scanner in = new Scanner(System.in);
    int guesses = 13;
    boolean checker = true;
    String answer = "Hello";

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

  }



}