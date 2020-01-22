package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue pseudoQueue;
    @Before
    public void setUp() throws Exception {
        pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(20);


    }

    @Test
    public void enqueue() {

        assertEquals(5, pseudoQueue.peek());

    }

    @Test
    public void dequeue() {
        pseudoQueue.dequeue();
        assertEquals(20, pseudoQueue.peek());

    }
}