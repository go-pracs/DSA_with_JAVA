package com.company;

public class UndirectedEdge {
    public WeightedNode first, second;
    public int weight;

    public UndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge (" + first + "," + second + "), weight = " + weight;
    }
}
