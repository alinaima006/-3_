package lab3;

public class ShibaInu extends Dog {
    protected String place;

    public ShibaInu(String color, int growth, int weight){
        super(color, growth, weight);
        place = "Japan";
    }
    public ShibaInu(){
        super();
        place = "Japan";
    }
}
