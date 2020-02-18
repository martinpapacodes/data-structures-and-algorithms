package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable testHashTable;

    @Before
    public void setUp() throws Exception {
        testHashTable = new Hashtable<String>();
        testHashTable.add("human", "martin");
        testHashTable.add("dog", "biggie");
        testHashTable.add("cat", "garfield");
        testHashTable.add("rockstar", "slash");
        testHashTable.add("favorite movie", "harry potter");
        testHashTable.add("favoritestore", "molly moons");


    }
        //    Write tests to prove the following functionality:
        //    1. Adding a key/value to your hashtable results in the value being in the data structure
        @Test
        public void testAddingToHashTable(){
            testHashTable.add("ice cream", "vanilla");
            String expected = "vanilla";
            Node actual = testHashTable.get("ice cream");
            assertEquals(expected, actual.getValue());
        }

        //    2. Retrieving based on a key returns the value stored
        @Test
        public void testGetValueWithKeyFromHashTable () {
            String expected = "biggie";
            Node actual = testHashTable.get("dog");
            assertEquals(expected, actual.getValue());
        }
        //    3. Successfully returns null for a key that does not exist in the hashtable

        @Test
        public void testKeyIfNullFromHashTable () {
            Node actual = testHashTable.get("social life");
            assertNull(actual);
        }

        //    4. Successfully handle a collision within the hashtable
        @Test
        public void testHandleACollision() {
        testHashTable.add("hero", "batman");
        testHashTable.add("hero", "robin");

        assertTrue( testHashTable.contains("hero"));
        }

        //   5. Successfully retrieve a value from a bucket within the hashtable that has a collision
        @Test
        public void testRetrieveAValueFromBucketWithCollision () {
            testHashTable.add("State", "Seattle");
            testHashTable.add("State", "California");
            testHashTable.add("Status", "tired");
            testHashTable.displayHashTable();
            // Will grab Seattle because it is the first one in the bucket
            assertEquals("Seattle", testHashTable.get("State").getValue());
        }

        //   6. Successfully hash a key to an in-range value
        @Test
        public void testHashAKey () {

            int actual = testHashTable.hash("jflkajfklaf");
            int expected = 9;
            assertEquals(expected, actual);
        }

    }
