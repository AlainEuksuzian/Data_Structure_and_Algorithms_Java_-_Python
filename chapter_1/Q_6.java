package chapter_1;

/*Write a pseudocode description of a method that reverses an array of n integers,
so that the numbers are listed in the opposite order than they were before, and
compare this method to an equivalent Java method for doing the same thing. */

/*
 * int counter1 = 0 int counter2 = array.length - 1
 * while counter1 is less than counter2:
 *      switch array element at location counter 1 and counter 2
 *      increase counter1, decrease counter 2
 */
public class Q_6 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int counter1 = 0;
        int counter2 = numbers.length-1;

        while (counter1 < counter2){
            int temp = numbers[counter1];
            numbers[counter1] = numbers[counter2];
            numbers[counter2] = temp;
            counter1++;
            counter2--;
        }

        for (int element: numbers){
            System.out.println(element);
        }

    }
    
}
