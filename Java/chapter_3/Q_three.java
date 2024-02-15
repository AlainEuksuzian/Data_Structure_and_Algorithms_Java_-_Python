package chapter_3;

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