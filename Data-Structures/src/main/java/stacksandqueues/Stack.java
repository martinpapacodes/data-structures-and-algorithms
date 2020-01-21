package stacksandqueues;

import java.util.EmptyStackException;

public class Stack {

    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node();

        newNode.value = value;
        newNode.next = top;
        top = newNode;
    }


    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.value;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int pop() {

        Node temp;
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            throw new EmptyStackException();
        }
        temp = top;
        top = top.next;
        return temp.value;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("%d -> ", temp.value);


                temp = temp.next;
            }
            System.out.println(" NULL");
        }
    }
}
