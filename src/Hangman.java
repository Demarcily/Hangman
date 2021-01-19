import java.util.Scanner;

public class Hangman {
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    int guesses = 13;
    boolean checker = true;
    String answer = "Hello";

    while (guesses > 0 && checker) {
      String Answerknown = in.next();
      if (Answerknown.equals(answer)) {
        checker = false;
      }
      else {
        guesses = guesses - 1;
        System.out.println(guesses + " guesses left");
      }
    }

    System.out.println("You won?");

  }
}

