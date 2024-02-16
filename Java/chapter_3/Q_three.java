package chapter_3;

/*Give an algorithm for finding the second-to-last node in a singly linked list in
which the last node is indicated by a null next reference. */

public class Q_three{
   private static LinkedList myList = new LinkedList();
    public static void main(String[] args) {
 
        myList.addToStart("One");
        myList.addToStart("two");
        myList.addToStart("three");
        myList.addToStart("four");
        myList.addToStart("five");
        
        int index = myList.getSize()-3;
        System.out.println(myList.getIndexElement(index));

       
        

    }

    

}