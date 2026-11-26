/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act2;

/**
 *
 * @author GUMERA_CPE113
 */
public class EngineeringPoint {
    

    // Private attributes
    private double x;
    private double y;

    // Constructor
    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setter for X-coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Setter for Y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Getter for X-coordinate
    public double getX() {
        return x;
    }

    // Getter for Y-coordinate
    public double getY() {
        return y;
    }

    // Calculate distance
    public double calculateDistance(EngineeringPoint point) {

        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Calculate slope
    public double calculateSlope(EngineeringPoint point) {

        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        if (dx == 0) {
            return Double.NaN;
        }

        return dy / dx;
    }
}
