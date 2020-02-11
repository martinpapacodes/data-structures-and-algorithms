package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {
    InsertionSort testInsertionSort;
    @Before
    public void setUp() throws Exception {

    testInsertionSort = new InsertionSort();
    }

    @Test
    public void testInsertionSort() {
        int[] expected = new int[] {4, 8, 15, 16, 23, 42};
        int[] testArray = new int[] {8, 4, 23, 42, 16, 15};
        testInsertionSort.insertionSort(testArray);

        assertArrayEquals(expected, testArray);
    }
}