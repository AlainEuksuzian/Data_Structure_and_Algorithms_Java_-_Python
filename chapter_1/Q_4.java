package chapter_1;

import java.util.Scanner;

/*Write a short Java method that counts the number of vowels in a given character
string */
public class Q_4 {
    private static char[] vowels = {'a','e','i','o','u','y'};
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = getUserInput("enter a sentence to count vowels: ");
        int counter = vowelCounter(sentence);
       System.out.printf("the sentence has %d vowels", counter);
    }

    public static int vowelCounter(String sentence){
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (contains(ch)){
                counter++;
            }
        }
        return counter;
    }

    public static boolean contains(char ch){

        for (int i = 0; i < vowels.length; i++){
            if (vowels[i] == ch){
                return true;
            }
        }
        return false;
       
    }
    

    public static String getUserInput(String message){
        System.out.print(message);
        return keyboard.nextLine();
    }
}
