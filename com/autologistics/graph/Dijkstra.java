package com.autologistics.graph;

import com.autologistics.logistics.Warehouse;

import java.util.*;

public class Dijkstra {
    public Map<Warehouse, Integer> shortestPaths(Graph graph, Warehouse start) {
        Map<Warehouse, Integer> dist = new HashMap<>();

        for (Warehouse w : graph.getWarehouses()) {
            dist.put(w, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        PriorityQueue<Warehouse> pq = new PriorityQueue<>(Comparator.comparingInt(dist::get));
        pq.add(start);

        while (!pq.isEmpty()) {
            Warehouse current = pq.poll();

            for (Route route : graph.getRoutes(current)) {
                int newDist = dist.get(current) + route.getDistance();

                if (newDist < dist.get(route.getTo())) {
                    dist.put(route.getTo(), newDist);
                    pq.add(route.getTo());
                }
            }
        }
        return dist;
    }
}
