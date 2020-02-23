package sort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort testSort = new QuickSort();

    @Test
    public void quickSortTest() {

    int[] actual = { 8, 4, 23, 42, 16, 15};
    int[] expected = { 4, 8, 15, 16, 23, 42 };

    assertArrayEquals(expected, testSort.quickSort(actual));

    }

    @Test
    public void anotherQuickSortTest() {

        int[] actual = { 15, 16, 42, 23, 4, 8};
        int[] expected = { 4, 8, 15, 16, 23, 42 };

        assertArrayEquals(expected, testSort.quickSort(actual));

    }


}