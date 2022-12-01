/**
 * This is a class that represents a point.
 *
 */
public class Point
{
    /** This is the x coordinate  */
    private double x;
    /** This is the y coordinate */
    private double y;
    /** Default constructor initializes coordinates to (0.0, 0.0)*/
    public Point()
    {
        x = 0.0;
        y = 0.0;
    }
    /**  Two parameter constructor initializes coordinates to
     @param setX -x coordinate
     @param setY - y coordinate*/

    public Point(double setX, double setY)
    {
        x = setX;
        y = setY;
    }
    /** set the x coordinate
     @param setX - x coordinate
     */
    public void setX(double setX)
    {
        x = setX;
    }

    /** set the y coordinate
     @param setY - y coordinate   */
    public void setY(double setY)
    {
        y = setY;
    }
    /** get the x coordinate
     @return double - the x coordinate value
     */
    public double getX()
    {
        return x;
    }

    /**  get the y coordinate
     @return double - the y coordinate value*/
    public double getY()
    {
        return y;
    }

    /** distance between this point and other point using the distance formula
     @param other the second point
     @return distance between this Point and other Point
     */
    public double distance(Point other)
    {
        return Math.sqrt(Math.pow(other.getY()-this.getY(),2) +
                Math.pow(other.getX() - this.getX(),2));
    }
    /** checks if two points are exactly the same location (probably need another "equals" for checking if points are about in the same place
     @param other a point
     @return true if they are exactly equal at both coordinates*/
    public boolean equals(Point other)
    {
        return (this.getX() == other.getX() && this.getY() == other.getY());
    }

    /** Standard point notation
     @return a string in the form (x,y)
     */
    public String toString()
    {
        return "("+getX()+","+getY()+")";
    }
}