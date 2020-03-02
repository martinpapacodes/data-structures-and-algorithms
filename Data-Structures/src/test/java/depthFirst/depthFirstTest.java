package depthFirst;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class depthFirstTest {
    Graph testGraph = new Graph();

    Node seaTac = testGraph.addNode("SeaTac");
    Node vancouver = testGraph.addNode("Vancouver");
    Node portland = testGraph.addNode("Portland");
    Node slc = testGraph.addNode("Salt Lake City");
    Node vegas = testGraph.addNode("Las Vegas");

    @Test
    public void depthFirst() {

        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);

        System.out.println(DepthFirst.depthFirst(vancouver).toString());

    }

    @Test
    public void testDepthFirstTwo() {
        Graph newGraph = new Graph();
        Node a = newGraph.addNode("A");
        Node b = newGraph.addNode("B");
        Node c = newGraph.addNode("C");
        Node d = newGraph.addNode("D");
        Node e = newGraph.addNode("E");
        Node f = newGraph.addNode("F");
        Node g = newGraph.addNode("G");
        Node h = newGraph.addNode("H");

        newGraph.addEdge(1, a, b);
        newGraph.addEdge(1, b, c);
        newGraph.addEdge(1, c, g);
        newGraph.addEdge(1, g, d);
        newGraph.addEdge(1, d, e);
        newGraph.addEdge(1, e, h);
        newGraph.addEdge(1, h, f);

        String expected = "[Node{name='A'}, Node{name='B'}, Node{name='C'}, Node{name='G'}, Node{name='D'}, Node{name='E'}, Node{name='H'}, Node{name='F'}]";

        assertEquals(expected, DepthFirst.depthFirst(a).toString());
    }

    @Test
    public void testDepthFirstThree() {

        Graph newGraph = new Graph();
        Node a = newGraph.addNode("A");
        Node b = newGraph.addNode("B");
        Node c = newGraph.addNode("C");
        Node g = newGraph.addNode("G");

        newGraph.addEdge(1, a, b);
        newGraph.addEdge(1, b, c);
        newGraph.addEdge(1, c, g);
        String expected = "[Node{name='B'}, Node{name='C'}, Node{name='G'}, Node{name='A'}]";
        assertEquals(expected, DepthFirst.depthFirst(b).toString());

    }

}