package chapter_3;

public class CircularlyLinkedList<E> {


    private static class Node<E> {
         private E element; // reference to the element stored at this node
         private Node<E> next; // reference to the subsequent node in the list

         public Node(E e, Node<E> n) {
            element = e;
            next = n;
            }

         public E getElement( ) { return element; }

         public Node<E> getNext( ) { return next; }

         public void setNext(Node<E> n) { next = n; }

         } //----------- end of nested Node class -----------


    private Node<E> tail = null; 
    private int size = 0; 
    public CircularlyLinkedList( ) { } 

    public int size( ) { return size; }

    public boolean isEmpty( ) { return size == 0; }

    public E first( ) {
        if (isEmpty( )) return null;
        return tail.getNext( ).getElement( ); 
        }

    public E last( ) { 
      if (isEmpty( )) return null;
      return tail.getElement( );
    }
    
    public void rotate( ) { 
      if (tail != null) 
      tail = tail.getNext( ); 
    }


        public void addFirst(E e) { // adds element e to the front of the list
        if (size == 0) {
        tail = new Node<>(e, null);
        tail.setNext(tail); // link to itself circularly
        } else {
        Node<E> newest = new Node<>(e, tail.getNext( ));
        tail.setNext(newest);
        }
        size++;
        }


        public void addLast(E e) { 
        addFirst(e); 
        tail = tail.getNext( );
        }


        public E removeFirst( ) {
            if (isEmpty( )) return null; 
                Node<E> head = tail.getNext( );

            if (head == tail) tail = null;

            else tail.setNext(head.getNext( )); 
            size--;
        return head.getElement( );
           }


           /*Give an implementation of the size( ) method for the CircularlyLinkedList class,
            assuming that we did not maintain size as an instance variable */
        public int getSize(){
            int size = 1;
            Node<E> pointer = tail.getNext();

            while(pointer != tail){
                pointer = pointer.getNext();
                size++;
            }
            return size;
        }

            /*Implement the equals( ) method for the CircularlyLinkedList class, assuming that
            two lists are equal if they have the same sequence of elements, with corresponding elements currently at the front of the list. */

        @Override
        public boolean equals(Object obj) {
            if (obj == null){
                return false;
            }
            else if (!(obj instanceof CircularlyLinkedList)){
                return false;
            }
            else {
                CircularlyLinkedList otherLinkedList = (CircularlyLinkedList) obj;

                if (this.size != otherLinkedList.size){
                    return false;
                }
                else {
                    Node thisPointer = this.tail.getNext();
                    Node otherPointer = otherLinkedList.tail.getNext();
                    int counter = 0;

                    while (counter < this.size){

                        if (!thisPointer.getElement().equals(otherPointer.getElement())){
                            return false;
                        }
                        thisPointer = thisPointer.getNext();
                        otherPointer = otherPointer.getNext();
                        counter++;

                    }
                    return true;
                }
            }
        }
}