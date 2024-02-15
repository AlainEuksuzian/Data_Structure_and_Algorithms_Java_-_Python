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

}
