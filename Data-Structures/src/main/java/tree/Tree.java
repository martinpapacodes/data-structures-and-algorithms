package tree;

public class Tree {

    public Node root;

    public void add(int value) {
        var newNode = new Node(value);

        if(root == null) {
            root = newNode;
        } else {
            Node otherNode = root;

            Node parent;

            while(true) {
                parent = otherNode;
                if(value < otherNode.value) {
                    otherNode = otherNode.left;
                    if(otherNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    otherNode = otherNode.right;
                    if(otherNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }

            }

        }

    }
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.value);

            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {

            System.out.println(node.value);
            preOrder(node.left);


            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {


            postOrder(node.left);


            postOrder(node.right);
            System.out.println(node.value);
        }


    }
}
