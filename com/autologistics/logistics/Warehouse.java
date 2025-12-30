package com.autologistics.logistics;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String id;
    private List<Part> parts = new ArrayList<>();

    public Warehouse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Warehouse{" + "id='" + id + '\'' + ", parts=" + parts + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse)) return false;
        Warehouse w = (Warehouse) o;
        return id.equals(w.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
