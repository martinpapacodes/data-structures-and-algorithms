package graph;

public class Edge {
    public int weight;
    public Node next;

    public Edge(int weight, Node next) {
        this.weight = weight;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", next=" + next.name +
                '}';
    }
}
