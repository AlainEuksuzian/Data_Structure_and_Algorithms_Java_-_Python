package chapter_3;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class LinkedList {
    
    private class Node{
        private Node link;
        private String item;

        Node(){
            this.link = null;
            this.item = null;
        }
        Node(String item, Node link ){
            this.link = link;
            this.item = item;
        }
    }   //end node
    private Node head;
    private Node previous;
    private Node position;
    private int size;

    LinkedList(){
        this.previous = null;
        this.position = null;
    }

    public void addToStart(String data){
        Node toAdd = new Node(data, head);
        head = toAdd;
        size++;
    }

    public String getIndexElement(int location){
        if (location >= size){
            throw new NoSuchElementException("index invalid");
        }
        else {
           Node current = head;

            for (int i = 0; i < location - 1; i++){
               current = current.link;
            }
            return current.item;
        }
    }

    public int getSize(){
        return size;
    }

    /*Give an algorithm for finding the second-to-last node in a singly linked list in
    which the last node is indicated by a null next reference */
    public  String getSecondToLast(){

        if (size > 1 ){
            Node prev = null;
            Node next = head;

            while(next.link != null){
                prev = next;
                next = next.link;
            }
            return prev.item;
        }
        else{
            return null;
        }
    }

    public Node getHead(){
        return head;
    }

    /*Give an implementation of the size( ) method for the SingularlyLinkedList class,
    assuming that we did not maintain size as an instance variable */

    public int getSizeManual(){

        int size = 0;
        Node position = head;
        while(position != null){
            position = position.link;
            size++;
        }
        return size;
    }

}
