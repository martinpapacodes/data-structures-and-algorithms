package tree;

import java.util.ArrayList;
// Inspiration : https://www.youtube.com/watch?v=M6lYob8STMI
public class Tree {

    public Node root;

    public Tree() {
        this.root = null;
    }

    public ArrayList<Integer> inOrder(Node node) {
        var inOrderList = new ArrayList<Integer>();
        if (node != null) {
            var left = inOrder(node.left);
            inOrderList.addAll(left);

            inOrderList.add(node.value);

            var right =  inOrder(node.right);
            inOrderList.addAll(right);
        }
        return inOrderList;
    }

    public ArrayList<Integer> preOrder(Node node) {
        var preOrderList = new ArrayList<Integer>();
        if (node != null) {
            preOrderList.add(node.value);

            var left = preOrder(node.left);
            preOrderList.addAll(left);


            var right = preOrder(node.right);
            preOrderList.addAll(right);
        }
        return preOrderList;
    }

    public ArrayList<Integer> postOrder(Node node) {
        var postOrderList = new ArrayList<Integer>();
        if (node != null) {


            var left = postOrder(node.left);
            postOrderList.addAll(left);

            var right = postOrder(node.right);
            postOrderList.addAll(right);

            postOrderList.add(node.value);
        }

        return postOrderList;
    }
}
