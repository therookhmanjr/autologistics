package com.autologistics;

import com.autologistics.car.*;
import com.autologistics.graph.Dijkstra;
import com.autologistics.graph.Graph;
import com.autologistics.logistics.Warehouse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse a = new Warehouse("A");
        Warehouse b = new Warehouse("B");

        Graph graph = new Graph();
        graph.addWarehouse(a);
        graph.addWarehouse(b);
        graph.addRoute(a, b, 10);

        Dijkstra dijkstra = new Dijkstra();
        System.out.println(dijkstra.shortestPaths(graph, a));



    }
}