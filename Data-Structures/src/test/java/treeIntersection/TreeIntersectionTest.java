package treeIntersection;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    TreeIntersection test;
    Node rootOne;
    Node rootTwo;

    @Test
    public void tree_intersectionTest() {
        String expected = "[160, 100, 500, 200, 125, 350, 175]";
        test = new TreeIntersection();

        rootOne = test.insertNode(rootOne, 150);
        rootOne = test.insertNode(rootOne, 100);
        rootOne = test.insertNode(rootOne, 250);
        rootOne = test.insertNode(rootOne, 75);
        rootOne = test.insertNode(rootOne, 160);
        rootOne = test.insertNode(rootOne, 200);
        rootOne = test.insertNode(rootOne, 350);
        rootOne = test.insertNode(rootOne, 125);
        rootOne = test.insertNode(rootOne, 175);
        rootOne = test.insertNode(rootOne, 300);
        rootOne = test.insertNode(rootOne, 500);


        rootTwo = test.insertNode(rootTwo, 42);
        rootTwo = test.insertNode(rootTwo, 100);
        rootTwo = test.insertNode(rootTwo, 600);
        rootTwo = test.insertNode(rootTwo, 15);
        rootTwo = test.insertNode(rootTwo, 160);
        rootTwo = test.insertNode(rootTwo, 200);
        rootTwo = test.insertNode(rootTwo, 350);
        rootTwo = test.insertNode(rootTwo, 125);
        rootTwo = test.insertNode(rootTwo, 175);
        rootTwo = test.insertNode(rootTwo, 4);
        rootTwo = test.insertNode(rootTwo, 500);

        String actual = test.tree_intersection(rootOne, rootTwo).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void anotherTree_intersectionTest() {
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]";
        test = new TreeIntersection();

        rootOne = test.insertNode(rootOne, 1);
        rootOne = test.insertNode(rootOne, 2);
        rootOne = test.insertNode(rootOne, 3);
        rootOne = test.insertNode(rootOne, 4);
        rootOne = test.insertNode(rootOne, 5);
        rootOne = test.insertNode(rootOne, 6);
        rootOne = test.insertNode(rootOne, 7);
        rootOne = test.insertNode(rootOne, 8);
        rootOne = test.insertNode(rootOne, 9);
        rootOne = test.insertNode(rootOne, 10);
        rootOne = test.insertNode(rootOne, 11);


        rootTwo = test.insertNode(rootTwo, 1);
        rootTwo = test.insertNode(rootTwo, 2);
        rootTwo = test.insertNode(rootTwo, 3);
        rootTwo = test.insertNode(rootTwo, 4);
        rootTwo = test.insertNode(rootTwo, 5);
        rootTwo = test.insertNode(rootTwo, 6);
        rootTwo = test.insertNode(rootTwo, 7);
        rootTwo = test.insertNode(rootTwo, 8);
        rootTwo = test.insertNode(rootTwo, 9);
        rootTwo = test.insertNode(rootTwo, 10);
        rootTwo = test.insertNode(rootTwo, 11);

        String actual = test.tree_intersection(rootOne, rootTwo).toString();

        assertEquals(expected, actual);
    }

    @Test
    public void anotherAnotherTree_intersectionTest() {
        String expected = "[3, 53, 9, 234, 11]";
        test = new TreeIntersection();

        rootOne = test.insertNode(rootOne, 3);
        rootOne = test.insertNode(rootOne, 6);
        rootOne = test.insertNode(rootOne, 9);
        rootOne = test.insertNode(rootOne, 11);
        rootOne = test.insertNode(rootOne, 13);
        rootOne = test.insertNode(rootOne, 41);
        rootOne = test.insertNode(rootOne, 64);
        rootOne = test.insertNode(rootOne, 234);
        rootOne = test.insertNode(rootOne, 532);
        rootOne = test.insertNode(rootOne, 35);
        rootOne = test.insertNode(rootOne, 53);


        rootTwo = test.insertNode(rootTwo, 53);
        rootTwo = test.insertNode(rootTwo, 2);
        rootTwo = test.insertNode(rootTwo, 3);
        rootTwo = test.insertNode(rootTwo, 4);
        rootTwo = test.insertNode(rootTwo, 5);
        rootTwo = test.insertNode(rootTwo, 11);
        rootTwo = test.insertNode(rootTwo, 7);
        rootTwo = test.insertNode(rootTwo, 8);
        rootTwo = test.insertNode(rootTwo, 9);
        rootTwo = test.insertNode(rootTwo, 234);
        rootTwo = test.insertNode(rootTwo, 11);

        String actual = test.tree_intersection(rootOne, rootTwo).toString();

        assertEquals(expected, actual);
    }


}