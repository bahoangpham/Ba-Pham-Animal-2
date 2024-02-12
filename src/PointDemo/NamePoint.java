package PointDemo;

public class NamePoint extends Point {
    private String name;
    public NamePoint(double x, double y, String name){
        super(x,y);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //a(1,2)
    public String toString(){
        //return name + super.toString();
        //return name + "(" + super.getX() + ", " + super.getY() + ")";
        return name + "(" + getX() + ", " + getY() + ")";

    }
}
