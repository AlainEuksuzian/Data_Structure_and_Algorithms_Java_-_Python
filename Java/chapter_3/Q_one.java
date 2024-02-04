package chapter_3;
/*Write a Java method that repeatedly selects and removes a random entry from an
array until the array holds no more entries. */
import java.util.Random;
public class Q_one {
    public static void main(String[] args) {

        Integer[] arr = {10,20,30,40,50,60,70,80,90,100};
        Random randLocation = new Random();
        while(!isAllNull(arr)){
            int index = randLocation.nextInt(arr.length);
            if (arr[index] != null){
                removeElement(arr, index);
            }
            printArray(arr);
        }
    }

    private static boolean isAllNull(Integer[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                return false;
            }
        }
        return true;
    }

    private static void printArray(Integer[] arr){
        for (Integer e: arr){
            System.out.print(e + ", ");
        }
        System.out.println();
        System.out.println("_______________________");
    }

    private static void removeElement(Integer[] arr, int index){
        for (int i = index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = null;
    }
}
