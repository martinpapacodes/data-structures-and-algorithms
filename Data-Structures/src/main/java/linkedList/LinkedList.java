package linkedList;

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
}
