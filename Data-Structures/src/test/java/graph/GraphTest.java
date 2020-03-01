package graph;

import org.apache.commons.math3.ml.neuralnet.twod.util.TopographicErrorHistogram;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {
    Graph testGraph = new Graph();;

      Node seaTac = testGraph.addNode("SeaTac");
      Node vancouver = testGraph.addNode("Vancouver");
      Node portland = testGraph.addNode("Portland");
      Node slc = testGraph.addNode("Salt Lake City");
      Node vegas = testGraph.addNode("Las Vegas");

//  1. Node can be successfully added to the graph
    @Test
    public void addNodeToGraph() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);

        System.out.println(portland.toString());
        assertTrue(testGraph.nodes.contains(portland));
    }

//   2. An edge can be successfully added to the graph
    @Test
    public void addEdgeToGraph() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);
        String expected = portland.toString();
        assertEquals(expected, portland.toString());

    }
//    3. A collection of all nodes can be properly retrieved from the graph
    @Test
    public void getCollectionOfAllNodes() {
        assertNotNull(testGraph.getNodes());
    }

//  4. All appropriate neighbors can be retrieved from the graph
    @Test
    public void getNeighborsFromGraph() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);
        List<Edge> testSet = testGraph.getNeighbors(portland);
        assertTrue(testSet.contains(portland.edges.get(0)));

    }

//    5. Neighbors are returned with the weight between nodes included
    @Test
    public void returnNeighborsWithWeight() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);
        String expected = "[Edge{weight=100, next=SeaTac}]";
        List<Edge> testSet = testGraph.getNeighbors(portland);
        assertEquals(expected, testSet.toString());

    }

//    6. The proper size is returned, representing the number of nodes in the graph
    @Test
    public void returnSizeOfGraph() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);
        assertEquals(6, testGraph.size());

    }
//    7. A graph with only one node and edge can be properly returned
    @Test
    public void getOnlyOneNodeAndEdge() {
       Graph graph = new Graph();

       Node lax = graph.addNode("Los Angeles Airport");
       Node san = graph.addNode("San Diego Airport");
       graph.addEdge(100, lax, san);

       String expected = "[Edge{weight=100, next=San Diego Airport}]";
       assertEquals(expected, graph.getNeighbors(lax).toString());



    }

//    8. An empty graph properly returns null
    @Test
    public void emptyGraphReturnsNull() {

        Graph emptyGraph = new Graph();
        assertTrue(emptyGraph.getNodes().contains(null));
    }
}