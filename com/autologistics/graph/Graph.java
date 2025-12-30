package com.autologistics.graph;

import com.autologistics.logistics.Warehouse;

import java.util.*;

public class Graph {
    private final Map<Warehouse, List<Route>> adj = new HashMap<>();

    public void addWarehouse(Warehouse w) {
        adj.putIfAbsent(w, new ArrayList<>());
    }

    public void addRoute(Warehouse from, Warehouse to, int distance) {
        adj. get(from).add(new Route(from, to, distance));
    }

    public List<Route> getRoutes(Warehouse w) {
        return adj.getOrDefault(w, Collections.emptyList());
    }

    public Set<Warehouse> getWarehouses() {
        return adj.keySet();
    }
}
