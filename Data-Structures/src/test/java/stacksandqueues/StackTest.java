package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stackTest;
    @Before
    public void setUp() throws Exception {
        stackTest = new Stack();
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);
        stackTest.push(4);
        stackTest.push(5);
    }

    @Test
    public void testForSinglePush() {
        stackTest.push(6);
        assertEquals(6, stackTest.peek());
    }

    @Test
    public void testForMultiplePush() {

    stackTest.push(6);
    stackTest.push(7);
    stackTest.push(8);

    assertEquals(8, stackTest.peek());
    }

    @Test
    public void testPop() {
        assertEquals(5, stackTest.pop());
    }

    @Test
    public void testIfEmptyAfterMultiplePops() {
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();

        assertTrue(stackTest.isEmpty());
    }
    @Test
    public void isEmpty() {
    Stack isEmptyStackTest = new Stack();
    assertTrue(isEmptyStackTest.isEmpty());
    }

    @Test
    public void peek() {
    assertEquals(5, stackTest.peek());
    }
}