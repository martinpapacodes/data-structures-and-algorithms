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

        stackTest.display();




    }

    @Test
    public void push() {



    }

    @Test
    public void isEmpty() {

    }

    @Test
    public void peek() {
    assertEquals(4, stackTest.peek());
    }

    @Test
    public void pop() {
    }

    @Test
    public void display() {
    }
}