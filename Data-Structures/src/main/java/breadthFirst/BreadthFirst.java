package breadthFirst;

import graph.Edge;
import graph.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirst {



    public static LinkedList<Node> breadthFirst(Node node) {


        LinkedList<Node> answers = new LinkedList<>();
        Queue<Node> stuffToSee = new LinkedList<Node>();
        Set<Node> stuffIHaveSeen = new HashSet<>();

        stuffToSee.add(node);
        stuffIHaveSeen.add(node);

        while(!stuffToSee.isEmpty()) {

            Node currentNode = stuffToSee.poll();
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

