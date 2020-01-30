package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeTest {

    Tree treeTest = new Tree();
    @Before
    public void setUp() throws Exception {

        treeTest.root = new Node(10);
        treeTest.root.left = new Node(20);
        treeTest.root.right = new Node(30);
        treeTest.root.left.left = new Node(40);
        treeTest.root.left.right = new Node(50);



    }
    @Test
    public void testInstantiateAnEmptyTree() {
        Tree emptyTree = new Tree();
        assertNull(emptyTree.root);
    }

    @Test
    public void testInstantiateTreeWithSingleNode() {
        treeTest.root = new Node(1);
        var expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected.toString(), treeTest.inOrder(treeTest.root).toString());
    }
    @Test
    public void testAddLeftChildAndRightChildToASingleRootNode() {
        treeTest.root = new Node(10);
        treeTest.root.left = new Node (20);
        treeTest.root.right = new Node (30);

        assertEquals("[10, 20, 30]",  treeTest.preOrder(treeTest.root).toString());
        
    }
    @Test
    public void testReturnACollectionFromPreOrder() {
        assertEquals("[10, 20, 40, 50, 30]", treeTest.preOrder(treeTest.root).toString());
    }

    @Test
    public void testReturnACollectionFromInOrder() {
        assertEquals("[40, 20, 50, 10, 30]", treeTest.inOrder(treeTest.root).toString());
    }

    @Test
    public void postOrder() {
        assertEquals("[40, 50, 20, 30, 10]", treeTest.postOrder(treeTest.root).toString() );
    }


    /////////// Code Challenge: Class 18 Tests
    @Test
    public void testForMaxValue() {
        treeTest.root.left.right = new Node(800);
        assertEquals(800, treeTest.findMaximumValue(treeTest.root));
    }

    @Test public void testForMaxValue2() {
        treeTest.root.left.right = new Node(999999);
        assertEquals(999999, treeTest.findMaximumValue(treeTest.root));
    }
}


