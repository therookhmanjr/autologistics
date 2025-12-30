package com.autologistics.car;

import java.util.List;

public class Car {
    private final Engine engine;
    private final Body body;
    private final List<Wheel> wheels;

    public Car(Engine engine, Body body, List<Wheel> wheels) {
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public Body getBody() {
        return body;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}
