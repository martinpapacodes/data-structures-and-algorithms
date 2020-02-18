package hashtable;

public class Node<T> {
    Node next;
    Node previous;
    T value;
    T key;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }


    public Node(T key, T value) {
        this.key = key;
        this.value = value;
        next = null;
        previous = null;
    }
}
