package utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

   FizzBuzzTree<String> fizzBuzzTreeTest = new FizzBuzzTree<>();


    @Before
    public void setUp() throws Exception {
        fizzBuzzTreeTest.root = new FizzBuzzTree.Node("3");
        fizzBuzzTreeTest.root.left = new FizzBuzzTree.Node("15");
        fizzBuzzTreeTest.root.right  = new FizzBuzzTree.Node("4");
        fizzBuzzTreeTest.root.left.left  = new FizzBuzzTree.Node("5");
        fizzBuzzTreeTest.root.left.right  = new FizzBuzzTree.Node("30");

    }

    @Test
    public void fizzBuzz() {

        fizzBuzzTreeTest.fizzBuzzTree(fizzBuzzTreeTest);

    }


}