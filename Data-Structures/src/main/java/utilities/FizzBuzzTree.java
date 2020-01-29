package utilities;

import com.sun.source.tree.BinaryTree;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;


public class FizzBuzzTree {


    public Tree<String> FizzBuzz(Tree<String> original) {
        Tree<String> sapling = new Tree<String>();
        sapling.root = traverse(original.root);


        //fulfills returning the new tree
        return sapling;

    }

    public Node<String> traverse(Node<String> me) {
        if(me == null) {
            return null;
        }

        Node leftNodes = traverse(me.left);
        Node rightNodes = traverse(me.right);

        System.out.println(me.value);


        Node<String> newNode = new Node();
        newNode.value = fizzBuzz(me.value);


        newNode.left = leftNodes;
        newNode.right = rightNodes;

        return newNode;






    }


    private String fizzBuzz(String number) {
        int num = Integer.parseInt(number);
        if(num % 15 == 0) {
            return "fizzBuzz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else if(num % 3 == 0) {
            return "fizz";
        } else {
            return number;
        }
     }
}
