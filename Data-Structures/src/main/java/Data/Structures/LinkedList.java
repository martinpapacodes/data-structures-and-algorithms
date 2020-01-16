package Data.Structures;

public  class LinkedList {

    public int value;
    public Node next;
    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if(isEmpty()) {
            first = node;
            last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;


        while(current != null) {
            if (current.value == item) {
                
                return index;
            }else {
                current = current.next;
                index++;
            }

        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst() {

    }

    public static Node mergeList(Node nodeOne, Node nodeTwo) {

        Node head = null;
        Node result = null;

        while(nodeOne != null || nodeTwo != null) {
            int tempValueHolder;
            if(nodeOne == null) {
                tempValueHolder = nodeTwo.value;
                nodeTwo = nodeTwo.next;
            } else if (nodeTwo == null) {
                tempValueHolder = nodeOne.value;
                nodeOne = nodeOne.next;
            } else if (nodeOne.value <= nodeTwo.value) {
                tempValueHolder = nodeOne.value;
                nodeOne = nodeOne.next;
            } else {
                tempValueHolder = nodeTwo.value;
                nodeTwo = nodeTwo.next;
            }

            if(result == null) {
                result = head = new Node(tempValueHolder);
            } else {
                result.next = new Node(tempValueHolder);
                result = result.next;
            }
        }
        return head;
    }

    }




