package chapter_1;
import java.util.Scanner;
/*Write a short Java method that uses a StringBuilder instance to remove all the
punctuation from a string s storing a sentence, for example, transforming the
string "Let’s try, Mike!" to "Lets try Mike". */

public class Q_5 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String sentenceInput = getUserInput("enter sentence to pase: ");
        
        String parsedSentence = removePunctuation(sentenceInput);

        System.out.println(parsedSentence);
    }
    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }

    public static String removePunctuation(String sentence){
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == ' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
