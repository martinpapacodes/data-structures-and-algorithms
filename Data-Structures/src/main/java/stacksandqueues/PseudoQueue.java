package stacksandqueues;

public class PseudoQueue {

    private Stack stackOne = new Stack();
    private Stack stackTwo = new Stack();


    public void enqueue(int value) {



    }


    public int peek() {
     if(stackTwo.isEmpty()) {
        while(!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
    }

        return stackTwo.peek();
    }

    public void dequeue() {
        while(!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        while(!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
    }

}
