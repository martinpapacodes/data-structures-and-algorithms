package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] testArray = {11,22,33,44,55,66,77};
        int testSearchKey = 90;

        int expected = -1;
        int actual = BinarySearch.BinarySearch(testArray, testSearchKey);

        assertEquals(expected, actual);
    }

}
