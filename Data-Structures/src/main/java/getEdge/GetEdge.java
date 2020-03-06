package getEdge;

import graph.Edge;
import graph.Graph;
import graph.Node;

import java.util.Set;

public class GetEdge {

    public static int getEdge(Graph vodka, String[] cityNames) {
        if(vodka == null || cityNames == null || cityNames.length < 2 || vodka.size() < 2) {
            throw new IllegalArgumentException();
        }

        int total = 0;

        Node curr = null;
        //It grabs the first city

        for(Node city : vodka.getNodes()) {
            System.out.println("node.name = " + city);
            System.out.println("cityNames = " + cityNames[0]);
            if( cityNames[0].equals(city.name)){
                curr = city;
            }
        }
        if(curr == null) {
            return -1;
        }

        for(int i = 1; i < cityNames.length; i++) {
            Node temp = curr;

            for(Edge edge : curr.edges) {
                if(edge.next.name.equals(cityNames[i])) {
                    total += edge.weight;
                    curr = edge.next;
                    break;
                }

            }
            if(curr == temp) {
                return -1;
            }
        }
        return total;
    }
}
