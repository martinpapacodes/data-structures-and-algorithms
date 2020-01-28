package tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() {

        BinarySearchTree newTree = new BinarySearchTree();


        newTree.add(50);
        newTree.add(25);
        newTree.add(15);
        newTree.add(30);
        newTree.add(75);
        newTree.add(85);

//        newTree.postOrder(newTree.root);
        System.out.println("newTree.contains(100) = " + newTree.contains(100));




    }
}