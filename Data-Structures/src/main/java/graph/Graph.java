package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Node, List<Node>> adjacentNodes;
    int size;


    public void addNode(String person) {
        adjacentNodes.putIfAbsent(new Node(person), new ArrayList<>());
        size++;
    }

    public void addEdge(String person, String anotherPerson) {
        Node node  = new Node(person);
        Node anotherNode = new Node(anotherPerson);
        adjacentNodes.get(node).add(anotherNode);
        adjacentNodes.get(anotherNode).add(node);
        size++;
        size++;
    }

    public List<Node> getNodes(String person){
        return adjacentNodes.get(new Node(person));
    }

    public void getNeighbors() {


    }

    public  void size() {

    }
}
