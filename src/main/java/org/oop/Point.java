package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double diff(double x, double y){
        return (x-y);
    }

    public double distance(Point from, Point to) {
        double xDistance = diff(to.x , from.x);
        double yDistance = diff(to.y , from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point from, Point to) {
        double xDistance = diff(to.x , from.x);
        double yDistance = diff(to.y , from.y);
        return Math.atan2(yDistance, xDistance);
    }
}
