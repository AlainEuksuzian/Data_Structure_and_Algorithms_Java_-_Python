package chapter_1;

/*PROGRAMMING PROBLEM:
Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i. */

public class Q_1 {
    public static void main(String[] args) {

        System.out.println(isMultiple(46, 2));


    }

    public static boolean isMultiple(long m, long n){
        if (m != 0 && m % n == 0){
            return true;
        }
        return false;
    }
}
