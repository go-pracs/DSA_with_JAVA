package com.company;

import java.util.Stack;

public class Algorithm {
    private Node targetNode;
    private volatile boolean isTargetFound = false;
    private int maxNodesVisited = 0;

    public Algorithm(Node targetNode) {
        this.targetNode = targetNode;
    }

    public void runDeepeningSearch(Node rootNode) {
        int depth = 0;

        while (!isTargetFound) {
            System.out.println();
            dfs(rootNode, depth);
            depth++;
        }
    }

    private void dfs(Node sourceNode, int depthLevel) {
        int tempMaxNodesVisited = 0;
        Stack<Node> stack = new Stack<>();
        sourceNode.setDepthLevel(0);
        stack.push(sourceNode);

        while (!stack.isEmpty()) {
            Node actualNode = stack.pop();
            tempMaxNodesVisited++;

            System.out.print(actualNode + " ");

            if (actualNode.getName().equals(this.targetNode.getName())) {
                System.out.println("Node has been found...");
                this.isTargetFound = true;
                return;
            }

            if(actualNode.getDepthLevel() >= depthLevel) {
                continue;
            }

            for (Node node: actualNode.getAdjacencyList()) {
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }

        if(tempMaxNodesVisited > maxNodesVisited) {
            maxNodesVisited = tempMaxNodesVisited;
        }
        else {
            System.out.println("Could not find Node " + targetNode);
            isTargetFound = true;
        }
    }
}
