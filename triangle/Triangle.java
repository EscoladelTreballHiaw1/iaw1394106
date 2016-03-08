/* Triangle.java
 * Modelizes a triangle
 * 
 * Copyright 2016-2017 Mamadou korka Diallo korka25@live.com
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package triangle;

public class Triangle {
    // the first side
    private double side1;
    // the second side
    private double side2;
    // the third side
    private double side3;
    
    /** 
     * Constructor with all the parameters
     * @param side1 a double number
     * @param side2 a double number
     * @param side3 a double number
     **/
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    /**
     * The default constructor
     */
    public Triangle() {
        this(3,4,5);
    }
    
    
    /**
     * Calculate the perimeter
     * @return the perimeter
     */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    /**
     * Calculate the area of the triangle
     * @return the area
     */
    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }
    
}