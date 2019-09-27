public class Point
{
   private double x;
   private double y;

   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   public double getX(){return x;}
   public double getY(){return y;}

   public double getRadius()
   {
      double r = Math.pow(x, 2) + Math.pow(y, 2);
      return Math.sqrt(r);
   }

   public double getAngle()
   {
      if(y == 0)
         return 0.0;
      if(x == 0)
         return Math.PI/2;

      double angle = Math.asin(y / getRadius());

      if(x < 0 && y < 0)
         angle = -1 * Math.PI - angle;     
      else if(x < 0)
         angle = Math.PI - angle;

      return angle;
   }

   public Point rotate90()
   {
      return new Point(-1 * y, x);
   }
}
