package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
//        nodeList.add(new GraphNode("A", 0));
//        nodeList.add(new GraphNode("B", 1));
//        nodeList.add(new GraphNode("C", 2));
//        nodeList.add(new GraphNode("D", 3));
//        nodeList.add(new GraphNode("E", 4));
//
//        Graph g = new Graph(nodeList);
//        g.addUndirectedEdge(0,1);
//        g.addUndirectedEdge(0,2);
//        g.addUndirectedEdge(0,3);
//        g.addUndirectedEdge(1,4);
//        g.addUndirectedEdge(2,3);
//        g.addUndirectedEdge(3,4);
//
//        System.out.print(g.toString());
//
//        g.BFS();
//        g.DFS();

//        nodeList.add(new GraphNode("A", 0));
//        nodeList.add(new GraphNode("B", 1));
//        nodeList.add(new GraphNode("C", 2));
//        nodeList.add(new GraphNode("D", 3));
//        nodeList.add(new GraphNode("E", 4));
//        nodeList.add(new GraphNode("F", 5));
//        nodeList.add(new GraphNode("G", 6));
//        nodeList.add(new GraphNode("H", 7));
//
//        Graph dgraph = new Graph(nodeList);
//        dgraph.addDirectedEdge(0,2);
//        dgraph.addDirectedEdge(1,2);
//        dgraph.addDirectedEdge(1,3);
//        dgraph.addDirectedEdge(2,4);
//        dgraph.addDirectedEdge(3,5);
//        dgraph.addDirectedEdge(4,5);
//        dgraph.addDirectedEdge(4,7);
//        dgraph.addDirectedEdge(5,6);
//
//        System.out.println(dgraph.toString());
//        dgraph.topologicalSort();

        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));

        Graph newGraph = new Graph(nodeList);
        newGraph.addUndirectedEdge(0,1);
        newGraph.addUndirectedEdge(0,2);
        newGraph.addUndirectedEdge(1,3);
        newGraph.addUndirectedEdge(1,6);
        newGraph.addUndirectedEdge(2,3);
        newGraph.addUndirectedEdge(2,4);
        newGraph.addUndirectedEdge(3,5);
        newGraph.addUndirectedEdge(4,5);
        newGraph.addUndirectedEdge(5,6);

        System.out.println(newGraph.toString());

        newGraph.BFSForSSSPP(nodeList.get(0));
    }
}
