package practice3;

public class Circle extends Shape{
    protected double radius;
    Circle(){
        super();
        radius = 5;
    }
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimetr(){
        return Math.PI*radius*2;
    }
    @Override
    public String toString(){
        return "";
    }
}
