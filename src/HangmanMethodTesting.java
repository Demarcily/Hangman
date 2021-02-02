import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanMethodTesting {
  public static void main (String[] args) {

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
    System.out.println(Word[number]);



  }

}