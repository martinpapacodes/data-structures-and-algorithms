package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queueTest;

    @Before
    public void setUp() throws Exception {
        queueTest = new Queue();
        queueTest.enqueue(1);
        queueTest.enqueue(2);
        queueTest.enqueue(3);
        queueTest.enqueue(4);
        queueTest.enqueue(5);
//        System.out.println("queueTest.dequeue() = " + queueTest.dequeue());

    }

    @Test
    public void testEnqueue() {
        queueTest.enqueue(20);
        System.out.println("quue = " + queueTest.peek());
    }

    @Test
    public void testDequeue() {
        int expected = 1;
        int actual = queueTest.dequeue();
        assertEquals(expected,actual);
    }

    @Test
    public void testPeek() {
        int expected = 1;
        int actual = queueTest.peek();

        assertEquals(expected, actual);
    }
    
    @Test 
    public void testIsEmpty() {
        assertFalse(queueTest.isEmpty());
    }
}