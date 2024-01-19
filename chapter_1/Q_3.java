package chapter_1;
import java.util.Scanner;
/*Write a short Java method that takes an integer n and returns the sum of all
positive integers less than or equal to n. 

6 Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n.

Write a short Java method that takes an integer n and returns the sum of the
squares of all positive integers less than or equal to n.*/

public class Q_3 {
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int number = getUserInput("enter a number to compute sum: ");
        int allSum = computeAllSum(number);
        int oddSum = computeOddPositiveSum(number);
        int sumSqaue = computeSumSquares(number);

        System.out.printf("all sum is %d \nodd sum is %d \nsum square: %d ", allSum, oddSum, sumSqaue);
    }


    public static int computeSumSquares(int number){
        int sum  = 0;

        for (int i = 0 ; i <= number ; i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }

    public static int computeOddPositiveSum(int number){
        int sum = 0;
        for (int i = 2; i <= number; i+=2){
            sum += i;
        }
        return sum;
    }

    public static int computeAllSum(int number){
        int sum = 0;

        for (int i =0; i <= number; i++){
            sum += i;
        }
        return sum;
    }


    public static int getUserInput(String message){
        System.out.print(message);
        return keyboard.nextInt();
    }
}
