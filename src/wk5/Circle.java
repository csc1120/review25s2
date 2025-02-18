/*
 * Course: CS 1021
 * Winter 2021
 * Demo
 * Name: Roby Velez
 * Created: 2/4/2022
 */
package wk5;

/**
 * Simple circle class with a radius
 */
public class Circle {
    private final double radius;
    /**
     * Constructor for a circle
     * @param radius radius of the circle
     */
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
