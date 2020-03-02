package depthFirst;

import graph.Edge;
import graph.Node;

import java.util.*;

public class DepthFirst {

    public static LinkedList<Node> depthFirst(Node node) {


        LinkedList<Node> answers = new LinkedList<>();
        Stack<Node> stuffToSee = new Stack<>();
        Set<Node> stuffIHaveSeen = new HashSet<>();

        stuffToSee.add(node);
        stuffIHaveSeen.add(node);

        while(!stuffToSee.isEmpty()) {

            Node currentNode = stuffToSee.pop();
            if(currentNode != null) {
                for(Edge edge : currentNode.edges) {
                    if(!stuffIHaveSeen.contains(edge.next)) {
                        stuffToSee.add(edge.next);
                        stuffIHaveSeen.add(edge.next);

                    }

                }
                answers.add(currentNode);
            }
        }



        return answers;
    }
}
