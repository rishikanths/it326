package SOLID.OCP.GoodPractise.shape;

/*
 * Create an abstraction that all shape must follow. Every shape, not matter what shape - both known and unknow
 * will have a way/formula to calculate the area of the shape.
 */
public abstract class Shape {

    public abstract double area();
}