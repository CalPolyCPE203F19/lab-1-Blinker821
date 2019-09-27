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
       return 0.0;
      /*double angle = Math.atan((Math.abs(x))/(Math.abs(y)));
      if(x < 0)
         angle += 
      */ return Math.atan
   }

   public Point rotate90()
   {
      return new Point(-1 * y, x);
   }
}
