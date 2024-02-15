package chapter_3;

public class Q_four {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7};

        int[] arr2 = {6,7,1,2,3,4,5};

        System.out.println(isEqual(arr, arr2));


    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null){
            return false;
        }

        if (arr1.length != arr2.length){
            return false;
        }

        int size = 0;

        for (int i = 0 ; i < arr1.length; i++){
            for (int k = 0; k < arr2.length; k++){
                if (arr1[i] == arr2[k]){
                    size++;
                }
            }
        }
        return size == arr1.length;
    }
}
