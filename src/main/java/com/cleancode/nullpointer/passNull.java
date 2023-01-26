package com.cleancode.nullpointer;

/**
 * Don’t Pass Null and Do NOT return it
 */
public class passNull {
    public double xProjection(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new InvalidArgumentException("Invalid argument for MetricsCalculator.xProjection");
        }
        return (p2.one - p1.two) * 15;
    }
    public double xProjectionAssertion(Point p1, Point p2) {
        assert p1 != null : "p1 should not be null";
        assert p2 != null : "p2 should not be null";
        return (p2.one - p1.two) * 1.5;
    }
}
