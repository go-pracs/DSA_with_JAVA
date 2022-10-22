package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode {
    public String name;
    public ArrayList<com.company.WeightedNode> neighbours = new ArrayList<>();
    public HashMap<com.company.WeightedNode, Integer> weightMap = new HashMap<>();
    public boolean isVisited = false;
    public com.company.WeightedNode parent;
    public int distance;
    public int index;

    public WeightedNode(String name, int index) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

}
