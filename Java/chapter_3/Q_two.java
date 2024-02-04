package chapter_3;

/*Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive, one
of which is repeated. Write an algorithm for finding the integer in A that is
repeated. */
import java.util.Arrays;
public class Q_two {
    public static void main(String[] args) {
        int[] arr = {1,20,30,40,50,60,70,10,10};
        System.out.println(hasDuplicates(arr));
        System.out.println(hasDuplicates2(arr));
    }

    /**
     * approach 1: replies on the Arrays.Sort() call before calling this one
     * @param arr the array to search for duplicates
     * @return the element that is a duplicate, null otherwise
     */
    private static Integer hasDuplicates(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++ ){
            if (arr[i] == arr[i + 1]){
                return arr[i];
            }
        }
        return null;
    }
    /**
     * loops through array with 2 pointers, if they are different 
     * indexes and element equals, returns element
     * @param arr to loop for duplicates
     * @return the element that is a duplicate, null otherwise
     */
    private static Integer hasDuplicates2(int[] arr){

        for (int i = 0; i < arr.length; i++){

            for (int k = i + 1; k < arr.length; k++){

                if (i != k && arr[i]==arr[k]){
                    return arr[i];
                }
            }
        }
        return null;
    }
}
 