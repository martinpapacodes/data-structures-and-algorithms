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

    }

    @Test
    public void testEnqueue() {
        queueTest.enqueue(20);

        String expected = "1 <- 2 <- 3 <- 4 <- 5 <- 20 <- ";
        String actual = queueTest.display();

        assertEquals(expected, actual);

    }
    @Test
    public void testForMultipleEnqueue() {
        queueTest.enqueue(6);
        queueTest.enqueue(7);
        queueTest.enqueue(8);

        String expected = "1 <- 2 <- 3 <- 4 <- 5 <- 6 <- 7 <- 8 <- ";
        String actual = queueTest.display();
        assertEquals(expected, actual);
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
    public void testIsEmptyAfterMultipleDequeues() {
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();

        assertTrue(queueTest.isEmpty());
    }
    @Test 
    public void testIsEmpty() {
        assertFalse(queueTest.isEmpty());
    }
}