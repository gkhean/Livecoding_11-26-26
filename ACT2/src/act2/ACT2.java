/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2;

/**
 *
 * @author GUMERA_CPE113
 */
public class ACT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 


        // Create three EngineeringPoint objects
        EngineeringPoint pointA = new EngineeringPoint(3, 4);
        EngineeringPoint pointB = new EngineeringPoint(9, 12);
        EngineeringPoint pointC = new EngineeringPoint(5, 10);

        

        // Display coordinates
        System.out.printf("%nPoint A: (%.2f, %.2f)%n",
                pointA.getX(), pointA.getY());

        System.out.printf("Point B: (%.2f, %.2f)%n",
                pointB.getX(), pointB.getY());

        System.out.printf("Point C: (%.2f, %.2f)%n",
                pointC.getX(), pointC.getY());

        // Calculate distance and slope between A and B
        double distanceAB = pointA.calculateDistance(pointB);
        double slopeAB = pointA.calculateSlope(pointB);

        // Calculate distance and slope between A and C
        double distanceAC = pointA.calculateDistance(pointC);
        double slopeAC = pointA.calculateSlope(pointC);

        // Calculate distance and slope between B and C
        double distanceBC = pointB.calculateDistance(pointC);
        double slopeBC = pointB.calculateSlope(pointC);

        // Display results for A and B
        System.out.println("\n----- Point A and Point B -----");
        System.out.printf("Distance: %.2f units%n", distanceAB);

        if (Double.isNaN(slopeAB)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeAB);
        }

        // Display results for A and C
        System.out.println("\n----- Point A and Point C -----");
        System.out.printf("Distance: %.2f units%n", distanceAC);

        if (Double.isNaN(slopeAC)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeAC);
        }

        // Display results for B and C
        System.out.println("\n----- Point B and Point C -----");
        System.out.printf("Distance: %.2f units%n", distanceBC);

        if (Double.isNaN(slopeBC)) {
            System.out.println("Slope: Undefined");
        } else {
            System.out.printf("Slope: %.2f%n", slopeBC);
        }
    }
}
