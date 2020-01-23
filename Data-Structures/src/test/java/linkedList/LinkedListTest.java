package linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList linkedListTest = new LinkedList();
    @Before
    public void setUp() throws Exception {
        linkedListTest.insert(1);
        linkedListTest.insert(2);
        linkedListTest.insert(3);
    }
    @Test
    public void testIfLinkedListIsEmpty() {
        var emptyLinkedList = new LinkedList();
        assertTrue(emptyLinkedList.isEmpty());

    }
    @Test
    public void testInsertIntoLinkedList() {
        linkedListTest.insert(4);
        String expected = "{ 4 } -> { 3 } -> { 2 } -> { 1 } -> NULL";
        String actual = linkedListTest.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testHeadPropertyPointingToFirstNode() {
        int expected = 0;
        assertEquals(expected, linkedListTest.indexOf(3));
    }
    @Test
    public void testInsertMultipleNodesIntoTheLinkedList() {
        linkedListTest.insert(5);
        linkedListTest.insert(6);
        linkedListTest.insert(7);

        String expected = "{ 7 } -> { 6 } -> { 5 } -> { 3 } -> { 2 } -> { 1 } -> NULL";
        assertEquals(expected, linkedListTest.toString());
    }
    @Test
    public void testReturnTrueIfValueExistInLinkedList() {
        assertEquals(true, linkedListTest.includes(2));

    }

    @Test
    public void testReturnFalseIfValueExistInLinkedList() {
        assertFalse(linkedListTest.includes(11));
    }
    @Test
    public void testToString() {
        String expected = "{ 3 } -> { 2 } -> { 1 } -> NULL";
        assertEquals(expected, linkedListTest.toString());
    }
}