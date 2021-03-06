package graph;

import java.util.LinkedList;
import java.util.List;

public class Node {
    public String name;
    public List<Edge> edges;

    Node(String person) {
        this.name = person;
        this.edges = new LinkedList<Edge>();
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }

    public String display() {
        return name + ',';
    }
}
