package breadthFirst;

import graph.Graph;
import graph.Node;
import javafx.css.converter.LadderConverter;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    Graph testGraph = new Graph();

    Node seaTac = testGraph.addNode("SeaTac");
    Node vancouver = testGraph.addNode("Vancouver");
    Node portland = testGraph.addNode("Portland");
    Node slc = testGraph.addNode("Salt Lake City");
    Node vegas = testGraph.addNode("Las Vegas");


    @Test
    public void testBreadthFirstOne() {
        testGraph.addEdge(100, seaTac, vancouver);
        testGraph.addEdge(100, seaTac, portland);
        testGraph.addEdge(100, seaTac, slc);
        testGraph.addEdge(100, slc, vegas);

        System.out.println(BreadthFirst.breadthFirst(vancouver).toString());

    }

    @Test
    public void testBreadthFirstTwo() {
        Graph newGraph = new Graph();
        Node pandora = newGraph.addNode("Pandora");
        Node arendelle = newGraph.addNode("Arendelle");
        Node metroville = newGraph.addNode("Metroville");
        Node monstropolis = newGraph.addNode("Monstropolis");
        Node narnia = newGraph.addNode("Narnia");
        Node naboo = newGraph.addNode("Naboo");

        newGraph.addEdge(1, pandora, arendelle);
        newGraph.addEdge(1, arendelle, metroville);
        String expected = "[Node{name='Pandora'}, Node{name='Arendelle'}, Node{name='Metroville'}]";

        assertEquals(expected, BreadthFirst.breadthFirst(pandora).toString());
    }

    @Test
    public void testBreadthFirstThree() {
        Graph newGraph = new Graph();
        Node pandora = newGraph.addNode("Pandora");
        Node arendelle = newGraph.addNode("Arendelle");
        Node metroville = newGraph.addNode("Metroville");
        Node monstropolis = newGraph.addNode("Monstropolis");
        Node narnia = newGraph.addNode("Narnia");
        Node naboo = newGraph.addNode("Naboo");

        newGraph.addEdge(1, pandora, arendelle);
        newGraph.addEdge(1, arendelle, metroville);
        newGraph.addEdge(1, metroville, monstropolis);
        newGraph.addEdge(1, metroville, narnia);
        newGraph.addEdge(1, narnia, naboo);

        String expected = "[Node{name='Pandora'}, Node{name='Arendelle'}, Node{name='Metroville'}, Node{name='Monstropolis'}, Node{name='Narnia'}, Node{name='Naboo'}]";
        assertEquals(expected, BreadthFirst.breadthFirst(pandora).toString());
    }
}