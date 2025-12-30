package com.autologistics.graph;

import com.autologistics.logistics.Warehouse;

public class Route {
    private final Warehouse from;
    private final Warehouse to;
    private final int distance;

    public Route(Warehouse from, Warehouse to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Warehouse getFrom() {
        return from;
    }

    public Warehouse getTo() {
        return to;
    }

    public int getDistance() {
        return distance;
    }
}
