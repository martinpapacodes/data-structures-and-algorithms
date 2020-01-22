package stacksandqueues;

public class PseudoQueue {

    private Stack stackOne = new Stack();
    private Stack stackTwo = new Stack();


    public void enqueue(int value) {
        stackOne.push(value);

    }


    public int peek() {
     if(stackTwo.isEmpty()) {
        while(!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }
    }

        return stackTwo.peek();
    }

    public int dequeue() {
        if(stackTwo.isEmpty()) {
            while(!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
        return stackTwo.pop();
    }

}
