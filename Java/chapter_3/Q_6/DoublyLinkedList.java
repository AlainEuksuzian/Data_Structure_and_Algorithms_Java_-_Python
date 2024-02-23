package chapter_3.Q_6;

public class DoublyLinkedList<E extends Comparable<E>> {
    
    private class Node<E>{
        private E element;
        private Node<E> previous;
        private Node<E> next;

        Node(){
            this.element = null;
            this.previous = null;
            this.next = null;
        }

        Node(E element, Node<E> previous, Node<E> next){
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getPrevious() {
            return previous;
        }



    } // end of inner node class

    private Node<E> head;
    private Node<E> tail;
    private Node<E> position;
    private int size;

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void addToStart(E element){
        
        if (isEmpty()){
            Node<E> toAdd = new Node<E>(element, null, null);
            head = toAdd;
            tail = toAdd;
        }
        else {
            Node<E> toAdd = new Node<E>(element, null, head);
            toAdd.setPrevious(null);
            head.setPrevious(toAdd);
            head = toAdd;
        }
        position = head;
        size++;
    }

    private void remove(Node<E> toRemove){

        Node<E> predecessor = toRemove.getPrevious();
        Node<E> successor =  toRemove.getNext();

        if (predecessor != null) {
            predecessor.setNext(successor);
        } 
        else {
            
            head = successor;
        }

        if (successor != null) {
            successor.setPrevious(predecessor);
        } 
        else {
            tail = predecessor;
        }
    }

    public E removeHeadNode(){
        if (isEmpty()){
            return null;
        }
        else {
            E toreturn = head.getElement();
            remove(head);
            head = head.getNext();
            size--;
            return toreturn; 
        }
    }

    private void removeLast(){
        if (isEmpty()){
            return;
        }
        else if (head == tail) {
            head = null;
            tail = null;
            size--;
        }
        else {
            Node<E> previous = null;
            Node<E> position = head;

           while(position.getNext() != null){
            previous = position;
            position = position.getNext();
           }
           previous.setNext(null);
           position.setPrevious(null);
           tail = previous;
           size--;
        }
    }

    private void sortLinkedList(){
        if (isEmpty() || size == 1){
            return;
        }
        else {
            Node<E> pointerOne = head;
            Node<E> pointerTwo = head.getNext();

            while(pointerOne != null){

                while(pointerTwo != null){

                    if (pointerOne.getElement().compareTo(pointerTwo.getElement()) < 0){
                        E temp = pointerOne.getElement();
                        pointerOne.setElement(pointerTwo.getElement());
                        pointerTwo.setElement(temp);
                    }
                    pointerTwo = pointerTwo.getNext();
                }
                pointerOne = pointerOne.getNext();
                pointerTwo = pointerOne.getNext();
            }

        }
    }

    public void addHighScore(E toAdd){
        if (size <= 9){
            addToStart(toAdd);
            sortLinkedList();
        }
        else {
            addToStart(toAdd);
            sortLinkedList();
            removeLast();
        }
    }

}
