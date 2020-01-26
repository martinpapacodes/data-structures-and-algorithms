package linkedList;

import javafx.scene.effect.Blend;
import org.apache.commons.math3.exception.OutOfRangeException;

import java.util.NoSuchElementException;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {

        return head == null;
    }

    public void insert(int value) {

        Node newNode = new Node(value);
        if(isEmpty()) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.value == value) return index;
            current=current.nextNode;
            index++;
        }
        throw new NoSuchElementException();
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if(current.value == value) return true;
            current = current.nextNode;
        }
        return false;
    }

    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += "{ " + current.value + " } -> ";
            current = current.nextNode;
        }
        return result + "NULL";
    }

    /////////////////// Code Challenge: Class 06

    public void append(int value) {
        Node current = head;
        var endNode = new Node(value);

        while(current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = endNode;
    }

    public void insertBefore(int insertBeforeThisValue, int newValue) {
        Node current = head;

        while(current.nextNode != null) {

            if(current.nextNode.value == insertBeforeThisValue) {
                var newNode = new Node(newValue);
                newNode.nextNode = current.nextNode;
                current.nextNode = newNode;
             return;
            }
            current = current.nextNode;

        }
    }

    public void insertAfter(int insertAfterThisValue, int valueToBeInserted) {

        Node current = head;


        while(current != null) {

            if(current.value == insertAfterThisValue) {
                var newNode = new Node(valueToBeInserted);
                newNode.nextNode = current.nextNode;
                current.nextNode = newNode;
            }
            current = current.nextNode;

        }
    }

    /////////////////// Code Challenge: Class 07

    public int kthFromEnd(int k) {
        Node current = head;
        Node temp = head;
        int length = 0;
        if (k < 0 ) throw new NullPointerException();
        while(current != null) {

            current = current.nextNode;
            length++;
        }
        // OutOfRangeException(Number wrong, Number lo, Number hi)
        if(length < k) throw new OutOfRangeException(k, 0, length);

        int newLength = length - k;
        for(int i = 1; i < newLength; i++) {
            temp = temp.nextNode;
        }

        return temp.value;

}

}
