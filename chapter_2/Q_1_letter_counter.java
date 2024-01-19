package chapter_2;
import java.util.HashMap;
import java.util.Scanner;

public class Q_1_letter_counter {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String letter = getUserInput("enter a message to get the count of words:");
        HashMap<Character,Integer> letterCounter = new HashMap<>();
        

        char[] charArray = letter.toCharArray();

        for (char ch : charArray){
            if (Character.isAlphabetic(ch)){
                if (letterCounter.containsKey(ch)){
                    int val = letterCounter.get(ch);
                    val++;
                    letterCounter.put(ch, val);
                }
                else{
                    letterCounter.put(ch, 1);
                }
            }
        }

        letterCounter.forEach((k,v) -> System.out.println(k +" => " + v));

    }

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
   
}
