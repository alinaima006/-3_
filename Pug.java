package lab3;

public class Pug extends Dog{
    protected String place;
    public Pug(){
        super();
        place = "Ancient China";
    }
    public Pug(String color, int growth, int weight){
        super(color, growth, weight);
        place = "Ancient China";
    }
}
