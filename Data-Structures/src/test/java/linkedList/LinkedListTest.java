package linkedList;

import org.apache.commons.math3.exception.OutOfRangeException;
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
    //////////////////// Code Challenge: Class 06 Test
    @Test
    public void testAppendToTheEndOfLinkedList() {

        linkedListTest.append(0);
        String expected = "{ 3 } -> { 2 } -> { 1 } -> { 0 } -> NULL";

        assertEquals(expected, linkedListTest.toString());
    }
    
    @Test 
    public void testMultipleAppendToTheEndOfTheLinkedList() {
        linkedListTest.append(1);
        linkedListTest.append(22);
        linkedListTest.append(45);
        String expected = "{ 3 } -> { 2 } -> { 1 } -> { 1 } -> { 22 } -> { 45 } -> NULL";

        assertEquals(expected, linkedListTest.toString());
    }
    
    @Test 
    public void testInsertANodeBeforeANode() {

        String expected = "{ 3 } -> { 100 } -> { 2 } -> { 1 } -> NULL";
        linkedListTest.insertBefore(2, 100);
        assertEquals(expected, linkedListTest.toString());
    }

    @Test
    public void testInsertANodeBeforeFirstNode() {

        linkedListTest.insert(20);
        String expected = "{ 20 } -> { 3 } -> { 2 } -> { 1 } -> NULL";

        assertEquals(expected, linkedListTest.toString());
    }
    @Test
    public void testInsertANodeAfterANode() {
        String expected = "{ 3 } -> { 2 } -> { 45 } -> { 1 } -> NULL";
        linkedListTest.insertAfter(2,45);
       assertEquals(expected, linkedListTest.toString());
    }

    @Test
    public void testInsertAfterTheLastNode() {
        String expected ="{ 3 } -> { 2 } -> { 1 } -> { 555 } -> NULL";
        linkedListTest.append(555);
        assertEquals(expected, linkedListTest.toString());
    }

    //////////////////// Code Challenge: Class 07 Test

    @Test (expected = OutOfRangeException.class)
    public void testWhereKIsGreaterThanLengthOfLinkedList()   {
        linkedListTest.kthFromEnd(65);
    }

    @Test
    public void testWhereKAndLengthOfTheListAreSame() {
        int expected = 3;
        assertEquals(3, linkedListTest.kthFromEnd(3));
    }
    
    @Test (expected = NullPointerException.class)
    public void testWhereKIsNotAPositiveInteger() {
        linkedListTest.kthFromEnd(-3);
    }

    @Test
    public void testWhereLinkedListIsOfSizeOne() {
        var test = new LinkedList();
        test.insert(100);

        assertEquals(100, test.kthFromEnd(0));
    }

    @Test
    public void testHappyPathWhereKIsNotAtTheEnd() {
        assertEquals(2, linkedListTest.kthFromEnd(1));
    }

    @Test
    public void testLinkedListMerge() {
        var listOne = new LinkedList();
        listOne.insert(2);
        listOne.insert(3);
        listOne.insert(1);

        var listTwo = new LinkedList();
        listTwo.insert(4);
        listTwo.insert(9);
        listTwo.insert(5);

        String expected =  "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> NULL";
        assertEquals(expected, linkedListTest.mergeLists(listOne, listTwo).toString());

    }

}
