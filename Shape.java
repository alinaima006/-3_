package practice3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        color = "Black";
        filled = true;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimetr();

    @Override
    public String toString(){
        return "";
    }
}
