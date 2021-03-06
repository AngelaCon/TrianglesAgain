public class Point {
    private double x,y;

  //construct a point given coordinates
    public Point(double X, double Y){
        x=X;
        y=Y;
    }

    public Point(Point p){
        x= p.x;  //private access in the same file is allowed!
        y= p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    public double distanceTo(Point other){
        return (Math.sqrt(Math.pow((this.y - other.y),2) + Math.pow((this.x - other.x),2)));
    }

    public boolean equals(Point other){
        return (this.x == other.x && this.y == other.y);
    }

}
