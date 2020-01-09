package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] testArray = {4,8,15,16,23,42};
        int testSearchKey =  15;

        int[] anotherTestArray = {11,22,33,44,55,66,77};
        int anotherSearchKey = 90;

        int expected = 2;
        int anotherExpected = -1;

        int actual = BinarySearch.BinarySearch(testArray, testSearchKey);
        int anotherActual = BinarySearch.BinarySearch(anotherTestArray, anotherSearchKey);

        assertEquals(expected, actual);
        assertEquals(anotherExpected, anotherActual);
    }

}
