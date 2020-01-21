package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {
    Node front, rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if(this.rear == null) {
            this.rear = newNode;
            this.front = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }

//        if(front == null) {


    }

    public int dequeue() {
        if(this.front == null) {
            throw new NoSuchElementException();

        } else {
            int temp = this.front.value;
            this.front = this.front.next;
            if(front == null) {
                rear = null;
            }
            return temp;
        }
    }
}
