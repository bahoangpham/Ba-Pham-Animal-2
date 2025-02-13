package MultiPoints;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //    public double distance(double x1, double y1, double x2, double y2){
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2)); //can cua (x2-x1)^2 - (y2-y1)^2

    }
}
