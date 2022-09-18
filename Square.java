package practice3;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(width);
        super.setLength(length);
    }
    @Override
    public void setLength(double side){
        super.setLength(length);
        super.setWidth(width);
    }
    @Override
    public String toString(){
        return "";
    }
}
