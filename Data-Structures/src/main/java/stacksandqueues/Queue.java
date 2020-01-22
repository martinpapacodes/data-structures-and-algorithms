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

    public boolean isEmpty() {
        return rear == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return front.value;
        } else {
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public String display() {
        String result = "";
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {
//                System.out.printf("%d <- ", temp.value);
                result += temp.value + " <- ";


                temp = temp.next;
            }
            System.out.println(" NULL");
        }
        return result;
    }
}
