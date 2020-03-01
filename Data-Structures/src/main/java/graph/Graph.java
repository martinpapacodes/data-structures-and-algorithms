package graph;

import java.util.*;

public class Graph {

    Set<Node> nodes;

    public Graph() {
        nodes = new HashSet<>();
        if(nodes.size() == 0) {
            nodes.add(null);
        }
    }

    public Node addNode(String name) {
        Node newNode = new Node(name);
        nodes.add(newNode);

    return newNode;
    }

    public void addEdge(int weight, Node nodeOne, Node nodeTwo) {
        nodeOne.edges.add(new Edge(weight, nodeTwo));
        nodeTwo.edges.add(new Edge(weight, nodeOne));


    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getNeighbors(Node node) {
        return node.edges;

    }

    public int size() {
       return nodes.size();
    }


}
