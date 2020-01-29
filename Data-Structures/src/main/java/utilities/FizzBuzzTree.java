package utilities;


public class FizzBuzzTree<T> {

    public Node<T> root;

    public FizzBuzzTree(Node<T> root) {
        this.root = root;

    }

    public FizzBuzzTree() {
        this.root = null;
    }

    public static class Node<T> {
        public T value;
        Node<T> left, right;

        public Node(T value, Node<T> left, Node<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(T value) {
            this.value = value;
            this.left = this.right = null;
        }

        public Node(){
            left = right = null;
            this.value = null;

        }
    }

    public static FizzBuzzTree<String> fizzBuzzTree(FizzBuzzTree<String> tree) {

        FizzBuzzTree otherTree = new FizzBuzzTree();
        otherTree.root = traverse(tree.root);


        //fulfills returning the new tree
        return otherTree;

    }

    public static Node<String> traverse(Node<String> current) {
        if(current == null) {
            return null;
        }

        Node<String> leftNodes = traverse(current.left);
        Node<String> rightNodes = traverse(current.right);

        System.out.println(current.value);


        Node<String> newNode = new Node<>();
        newNode.value = fizzBuzz(current.value);


        newNode.left = leftNodes;
        newNode.right = rightNodes;

        return newNode;

    }

    private static String fizzBuzz(String number) {
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
