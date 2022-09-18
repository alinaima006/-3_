package lab3;

public abstract class Dog {
    protected String color;
    protected String command;
    protected int growth;
    protected int weight;
    public Dog(){
        color = "Brown";
        growth = 30;
        weight = 20;
    }
    public Dog(String color, int growth, int weight){
        this.color = color;
        this.growth = growth;
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public String toString(){
        return "Dog color is " + color + " and it's weight is " + weight + " kg. It's growth is " + growth;
    }
    public String Sit(){
        return "\tThe dog hears the command 'Sit!'. It sat down";
    }
}
