public class Triangle.java {
    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

     public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
         v1 = new Point(x1,y1);
         v2 = new Point(x2,y2);
         v3 = new Point(x3,y3);
     }


     public double getPerimeter() {
         return (v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3));
     }

     public double getArea(){
         double semi = this.getPerimeter() / 2;
         return Math.sqrt(semi*(semi - v1.distanceTo(v2))*(semi - v1.distanceTo(v3))*(semp - v2.distanceTo(v3)));
     }

     public String classify(){
        double sideA = v1.distanceTo(v2);
        double sideB = v1.distanceTo(v3);
        double sideC = v2.distanceTo(v3);
        sideA = Math.round(sideA * 10000.0) / 10000.0;
        sideB = Math.round(sideB * 10000.0) / 10000.0;
        sideC = Math.round(sideC * 10000.0) / 10000.0;
        if (sideA == sideB && sideB ==sideC) return "equilateral";
        if ( sideA == sideB || sideB == sideC || sideC == sideA) return "isosceles";
        return "scalene";
    }

    public String toString(){
        return( "v1(" + this.v1.getX() + ", " + this.v1.getY() + ") " +
                "v2(" + this.v2.getX() + ", " + this.v2.getY() + ") " +
                "v3(" + this.v3.getX() + ", " + this.v3.getY() + ")");
    }

    public void setVertex(int index, Point newp) {
        if (index == 0) v1 = new Point(newp.getX(), newp.getY());
        if (index == 1) v2 = new Point(newp.getX(), newp.getY());
        if (index == 2) v3 = new Point(newp.getX(), newp.getY());
        }

}
