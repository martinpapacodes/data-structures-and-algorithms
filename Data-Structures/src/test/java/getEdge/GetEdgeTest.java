package getEdge;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    Graph testGraph = new Graph();;

    Node seaTac = testGraph.addNode("SeaTac");
    Node vancouver = testGraph.addNode("Vancouver");
    Node portland = testGraph.addNode("Portland");
    Node slc = testGraph.addNode("Salt Lake City");
    Node vegas = testGraph.addNode("Las Vegas");

    @Test
    public void happyCase() {

        testGraph.addEdge(50, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(150, seaTac, slc);
        testGraph.addEdge(200, slc, vegas);

        String[] cities = new String[]{vancouver.name, seaTac.name, slc.name};

        assertEquals(200, GetEdge.getEdge(testGraph, cities));

    }

    @Test
    public void happyCase2() {

        testGraph.addEdge(50, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(150, seaTac, slc);
        testGraph.addEdge(200, slc, vegas);

        String[] cities = new String[]{slc.name, seaTac.name, vancouver.name};

        assertEquals(200, GetEdge.getEdge(testGraph, cities));

    }

    @Test
    public void failingCase() {


        testGraph.addEdge(50, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(150, seaTac, slc);
        testGraph.addEdge(200, slc, vegas);

        String[] cities = new String[]{vancouver.name, seaTac.name, vegas.name};
        assertEquals(-1, GetEdge.getEdge(testGraph, cities));

    }
}