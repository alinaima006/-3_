package lab3;

public class Labrador extends Dog{
    protected String place;

    public Labrador(){
        place = "Canada";
    }
    public Labrador(String color, int growth, int weight){
        super(color, growth, weight);
        place = "Canada";
    }
}
