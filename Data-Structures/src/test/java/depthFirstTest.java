import depthFirst.DepthFirst;
import graph.Graph;
import graph.Node;
import org.junit.Test;

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
}