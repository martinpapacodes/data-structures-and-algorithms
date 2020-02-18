package hashtable;

//Inspiration/Reference: https://gist.github.com/jonalmeida/b561c594f58091a8d387
public class Hashtable<T> {

    final int size = 16;
    private Node<T>[] hashTable;


    public Hashtable() {
        hashTable = new Node[size];
    }

    public Hashtable(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Cannot accept a negative number.");
        } else {
            hashTable = new Node[initialSize];
        }
    }

    public void add(T key, T value) {
        Node<T> newNode = new Node(key, value);
        int position  = hash(key);
        if(hashTable[position] == null) {
            hashTable[position] = newNode;
        } else {
            Node retrieveNode = hashTable[position];

            while(retrieveNode != null) {
                if(retrieveNode.getKey() == null) {
                    retrieveNode.setNext(newNode);
                    newNode.setPrevious(retrieveNode);
                    return;
                }

                if(retrieveNode.getNext() == null) {
                    retrieveNode.setNext(newNode);
                    newNode.setPrevious(retrieveNode);
                    return;
                }

                retrieveNode = retrieveNode.getNext();
            }
        }

    }

    public Node get(T key) {
        int position = hash(key);

            Node<T> retrievedNode = hashTable[position];
            while(retrievedNode != null) {
                if(retrievedNode.getKey() == key) {
                    return retrievedNode;
                } else {
                    retrievedNode = retrievedNode.getNext();
                }
            }
            return null;
        }
    public boolean contains(T key) {
        if(get(key) instanceof Node) {
            return true;
        } else {
            return false;
        }

    }
    public int hash(T key) {
        if(key instanceof String) {
            int hash = 0;
            for (int i = 0; i < ((String)key).length(); i++) {
                hash += ((String) key).charAt(0);
                hash += (hash << 10);
                hash ^= (hash << 6);

            }

            hash += (hash << 3);
            hash += (hash >> 11);
            hash += (hash << 15);

            return (hash & 0xff) % (hashTable.length -1);
        } else {
            return (key.hashCode() % 0xff) % (hashTable.length -1);
        }
    }


    public void displayHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if(hashTable[i] != null) {
                System.out.println(hashTable[i].getKey() + "\t " +  hashTable[i].getValue());
            }
        }
    }

}
