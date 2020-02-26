package graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    Graph testGraph;
    @Before
    public void setUp() throws Exception {
        testGraph.addNode("Serge");
        testGraph.addNode("Rommel");
        testGraph.addNode("Phong");
        testGraph.addNode("Micah");
        testGraph.addNode("Dayne");
        testGraph.addEdge("Serge", "Rommel");
        testGraph.addEdge("Serge", "Micah");
        testGraph.addEdge("Rommel", "Phong");
        testGraph.addEdge("Micah", "Phong");
        testGraph.addEdge("Rommel", "Dayne");
        testGraph.addEdge("Micah", "Dayne");
    }

    @Test
    public void addNode() {
    }

    @Test
    public void addEdge() {
    }

    @Test
    public void getNodes() {
        testGraph.getNodes("Dayne");
    }

    @Test
    public void getNeighbors() {
    }

    @Test
    public void size() {
    }
}