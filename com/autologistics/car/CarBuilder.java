package com.autologistics.car;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
    private Engine engine;
    private Body body;
    private List<Wheel> wheels = new ArrayList<>();

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setBody(Body body) {
        this.body = body;
        return this;
    }

    public CarBuilder addWheel(Wheel wheel) {
        if(wheels.size() < 4) {
            wheels.add(wheel);
        }
        return this;
    }

    public Car build() {
        if (engine == null || body == null || wheels.size() != 4) {
            throw new IllegalStateException("Car is not complete");
        }
        return new Car(engine, body, wheels);
    }
}
