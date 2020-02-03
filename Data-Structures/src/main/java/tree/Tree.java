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

    /////////// Code Challenge: Class 17
    //    Inspiration: https://www.youtube.com/watch?v=Kfm00t4YKow&t=100s
        public String breadthFirstTraversal(Node node) {
            Queue<Node> queue = new LinkedList<Node>();
            String result ="";
            queue.add(node);



            while(!queue.isEmpty()) {
                node = queue.remove();
                result += node.value + " ";

                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            return result;
        }
    /////////// Code Challenge: Class 18
    // Inspiration :  https://www.geeksforgeeks.org/find-maximum-or-minimum-in-binary-tree/
    public int findMaximumValue(Node node) {

        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int max = node.value;
        int leftMax = findMaximumValue(node.left);
        int rightMax = findMaximumValue(node.right);

        if(leftMax > max) {
            max = leftMax;
        }
        if(rightMax > max) {
            max = rightMax;
        }

        return max;

    }
}
