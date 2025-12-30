package com.autologistics.logistics;

import java.util.*;

public class Warehouse {
    private final String id;
    private final List<Part> parts = new ArrayList<>();

    public Warehouse(String id) {
        this.id = id;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public String getId() {
        return id;
    }

    public List<Part> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse)) return false;
        Warehouse that = (Warehouse) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
