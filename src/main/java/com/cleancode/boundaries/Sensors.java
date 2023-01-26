package com.cleancode.boundaries;

import java.util.HashMap;
import java.util.Map;
import sun.management.Sensor;

/**
 * The interface at the boundary (Map) is hidden. It is able to evolve with very little impact on
 * the rest of the application. The use of generics is no longer a big issue because the casting
 * and type management is handled inside the Sensors class.
 */
public class Sensors {
    private Map sensors = new HashMap();
    public Sensor getById(String id) {
        return (Sensor) sensors.get(id);
    }
}