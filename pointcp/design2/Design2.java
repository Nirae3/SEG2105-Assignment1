public class Design2 extends PointCP
{
  // Instance variables
  private double rho;     
  private double theta;   // Angle in radians from the positive x-axis (polar coordinate)

  // Constructors
  public Design2(double rho, double theta)
  {
	super('P',rho * Math.cos(theta), rho * Math.sin(theta));
    this.rho = rho;
    this.theta = theta;
  }

  // Instance methods

  public double getX()
  {
    return rho * Math.cos(theta);
  }


  public double getY()
  {
    return rho * Math.sin(theta);
  }


  public double getRho()
  {
    return rho;
  }

  public double getTheta()
  {
    return theta;
  }


  public double getDistance(Design2 point)
  {
    double deltaX = getX() - point.getX();
    double deltaY = getY() - point.getY();

    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }


	/*
	 * public void rotatePoint(double angle) { theta += Math.toRadians(angle); }
	 */


  public String toString()
  {
    return "Polar [" + rho + "," + theta + "]";
  }
}
