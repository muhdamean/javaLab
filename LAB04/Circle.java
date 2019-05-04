
/**
 * Write a description of class Circle here.
 *
 *LAB04 
 * ALIYU MUHAMMAD AMINU
 * U15/FNS/CSC/038
 */
public class Circle
{
    private static int numberOfCircles = 0;//a static variable
    private double radius; //instance variables
    public Circle(double circleRadius) {
    numberOfCircles++;
    radius = circleRadius;
    }
    public double area() {
    return Math. PI * radius * radius;
    }
    public double circumference() {
    return 2.0 * Math.PI * radius;
    }
    
    public static int getNumberOfCircles() {
    return numberOfCircles;
    }
}
