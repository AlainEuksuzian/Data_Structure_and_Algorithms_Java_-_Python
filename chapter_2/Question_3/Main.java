package chapter_2.Question_3;


import java.net.URI;
/*PROGRAMMING PROJECT:
 * Write a Java program that simulates a system that supports the functions of an e-book reader. 
 * You should include methods for users of your system to “buy” new
    books, view their list of purchased books, and read their purchased books. Your
    system should use actual books, which have expired copyrights and are available
    on the Internet, to populate your set of available books for users of your system
    to “purchase” and read.
 */
import java.util.HashMap;
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Main {
  private static Scanner keyboard = new Scanner(System.in);
  private static HashMap<Book,String> purchasedBooks = new HashMap<>();

  private static BookReader readerOne = new BookReader("alain", "12345", 40,purchasedBooks);
    public static void main(String[] args) {

      int option = Integer.parseInt(getUserInput("Choose option:\n1) buy book\n2)View list of books\n3)read purchased book\n"));

      switch (option) {
        case 1:
          
          break;
        case 2:

          break;
        case 3:

          break;


        default:
        System.out.println("invalid option, program will end");
        System.exit(0);
          break;
      }


    
    }
    public static String getUserInput(String message){
      System.out.print(message);
      return keyboard.nextLine();
    }

}
