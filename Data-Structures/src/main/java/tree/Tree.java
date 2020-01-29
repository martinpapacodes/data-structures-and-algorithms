package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
//    Queue<Node> q = new LinkedList<Node>();
//		if (root == null)
//            return;
//		q.add(root);
//		while (!q.isEmpty()) {
//        Node n = (Node) q.remove();
//        System.out.print(" " + n.data);
//        if (n.left != null)
//            q.add(n.left);
//        if (n.right != null)
//            q.add(n.right);
//
//        public void breadthFirstTraversal(Node node) {
//            Queue<Node> queue = new LinkedList<Node>();
//            queue.add(node);
//
//            while(queue.isEmpty()) {
//                node
//            }
//
//
//        }
}
