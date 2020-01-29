package tree;


public class BinarySearchTree extends Tree {


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

    public boolean contains(int valueThatWeAreLookingFor) {
        Node node = root;
        while(node.value != valueThatWeAreLookingFor) {
            if(valueThatWeAreLookingFor < node.value) {
                node = node.left;
            } else {
                node = node.right;
            }

            if(node == null) {
                return false;
            }
        }
        return true;
    }
}
