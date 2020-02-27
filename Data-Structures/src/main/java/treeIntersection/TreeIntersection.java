package treeIntersection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TreeIntersection {
// Reference/Inspiration: https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
    public Set<Integer> tree_intersection(Node treeRoot, Node anotherTreeRoot) {

        HashSet<Integer> intersectionSet = new HashSet<>();
        Stack<Node> treeOne = new Stack<>();
        Stack<Node> treeTwo = new Stack<>();

        while(true) {
            if(treeRoot != null) {
                treeOne.push(treeRoot);
                treeRoot = treeRoot.left;
            } else if(anotherTreeRoot != null) {
                treeTwo.push(anotherTreeRoot);
                anotherTreeRoot = anotherTreeRoot.left;
            } else if (!treeOne.isEmpty() && !treeTwo.isEmpty()) {
                treeRoot = treeOne.peek();
                anotherTreeRoot = treeTwo.peek();

                if(treeRoot.value == anotherTreeRoot.value) {
                    intersectionSet.add(treeRoot.value);
                    treeOne.pop();
                    treeTwo.pop();

                    treeRoot = treeRoot.right;
                    anotherTreeRoot = anotherTreeRoot.right;

                } else if (treeRoot.value < anotherTreeRoot.value) {
                    treeOne.pop();
                    treeRoot = treeRoot.right;
                    anotherTreeRoot = null;
                } else if (treeRoot.value > anotherTreeRoot.value) {
                    treeTwo.pop();
                    anotherTreeRoot = anotherTreeRoot.right;
                    treeRoot = null;
                }
            } else {
                break;
            }
        }
        return intersectionSet;
    }

    public Node insertNode(Node node, int value) {

        if(node == null) {
            Node newNode = new Node(value);
            return newNode;
        }

        if( value < node.value) {
            node.left = insertNode(node.left, value);
        } else if (value > node.value) {
            node.right = insertNode(node.right, value);
        }
        return node;
    }



}
