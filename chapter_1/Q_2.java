package chapter_1;

/*Write a short Java method, isEven, that takes an int i and returns true if and only
if i is even. Your method cannot use the multiplication, modulus, or division
operators, however. */

public class Q_2 {
    public static void main(String[] args) {
        
        System.out.println(isEven(14));
        
        }

    public static boolean isEven(int i){
        
        while( i > 0){
            i -= 2;
        }
        if ( i == 0){
            return true;
        }
        return false;
        
    }
}
