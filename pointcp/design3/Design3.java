
public class Design3 extends PointCP
{

  private double x;     // x-coordinate in Cartesian coordinates
  private double y;     // y-coordinate in Cartesian coordinates

  // Constructors
  public Design3(double x, double y)
  {
	super('C', x,y);
    this.x = x;
    this.y = y;
  }

  // Instance methods


  public double getX()
  {
    return x;
  }


  public double getY()
  {
    return y;
  }


  public double getRho()   //from Cartesian to polar coord and returns rho
  {
    return Math.sqrt(x * x + y * y); //not stored but returned
  }


  public double getTheta()
  {
    return Math.atan2(y, x);
  }

  public double getDistance(PointCP point)
  {
    double deltaX = x - point.getX();
    double deltaY = y - point.getY();

    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }


  public PointCP rotatePoint(double angle)
  {
    double radRotation = Math.toRadians(angle);
    double cosTheta = Math.cos(radRotation);
    double sinTheta = Math.sin(radRotation);
    double newX = x * cosTheta - y * sinTheta;
    double newY = x * sinTheta + y * cosTheta;

    x = newX;
    y = newY;
    
    return this;
  }


  public String toString()
  {
    return "Cartesian (" + x + "," + y + ")";
  }
}
