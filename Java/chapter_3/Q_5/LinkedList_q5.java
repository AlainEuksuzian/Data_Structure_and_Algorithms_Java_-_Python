package chapter_3.Q_5;

/*write a class that maintains the top ten scores for a game application, implementing the add and remove methods of Section 3.1.1, but using a singly linked list
instead of an array. */

public class LinkedList_q5<E extends Comparable<E>>{

    private class Node<E>{
        private E element;
        private Node<E> next;

        Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }

        Node(){
            this.element = null;
            this.next = null;
        }

        private E getElement(){
            return this.element;
        }

        private void setElement(E input){
            this.element = input;
        }

        private void setNext(Node<E> nextInput){
            this.next = nextInput;
        }

        private Node<E> getNext(){
            return this.next;
        }

    } // end of node class

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public void addToStart(E element){
        Node<E> toAdd = new Node<E>(element, null);
        if (size == 0){
            head = toAdd;
            tail = head;
        }
        else {
            toAdd.setNext(head);
            head = toAdd;
        }
        size++;
    }

    public E removeHead(){
        if (size == 0){
            return null;
        }
        else {
            E toReturn = head.getElement();
            head = head.getNext();
            size--;
            return toReturn;
        }
    }

    public void addLast(E element){
        if (size == 0){
            addToStart(element);
        }
        else{
            Node<E> toAdd = new Node<E>(element, null);
            tail.setNext(toAdd);
            tail = toAdd;
            size++;

        }
    }

    public void removeTail(){

        if (head == tail){
            head = null;
            tail = null;
        }
        else{
            Node<E> previous = null;
            Node<E> position = head;

            while(position.getNext() != null){
                previous = position;
                position = position.getNext();
            }
            previous.setNext(null);
            tail = previous; 
        }
    }


    /**
     * returns the size of the list
     * @return int indating the size
     */
    public int getSize(){
        return size;
    }

    /**
     * 
     * @return true if size = 0
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * returns first but does not remove
     * @return head element
     */
    public E first(){
        if (isEmpty()){
            return null;
        }
        else {
            return head.getElement();
        }
    }

    /**
     * returns last element, does not remove
     * @return tail element
     */
    public E last(){
        if (isEmpty()){
            return null;
        }
        else {
            return tail.getElement();
        }
    }

    private void SortLinkedList(){
        if (isEmpty() || size == 1){
            return;
        }
        else {
            Node<E> pointerOne = head;
            Node<E> pointerTwo = pointerOne.getNext();

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

    public void addHighScore(E object){
        if (size <= 9){
            addToStart(object);
            SortLinkedList();
        }
        else {
            addToStart(object);
            SortLinkedList();
            removeTail();
            
        }
    }

    public void printHighScores(){
        Node<E> position = head;

        while(position != null){
            System.out.println(position.getElement());
            position = position.getNext();
        }
    }
}