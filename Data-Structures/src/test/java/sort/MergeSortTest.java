package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    MergeSort testMerge = new MergeSort();
    @Test
    public void testMergeSort() {
//        [8,4,23,42,16,15]

        int[] actual = { 8, 4, 23, 42, 16, 15 };
        int[] expected = { 4, 8, 15, 16, 23, 42 };

        testMerge.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

}