package lab3;

public class DogTest {
    public static void main(String[] args){
        Dog d1 = new Labrador();
        System.out.println("This dog breed is a labrador. " + d1);
        System.out.println("\tIt's color is " + d1.getColor());
        Dog d2 = new ShibaInu("Black", 30, 12);
        System.out.println("Dog breed is Shiba Inu. " + d2);
        System.out.println("\tGrowth is " + d2.getGrowth());
        Dog d3 = new Pug("Beige", 28, 8);
        System.out.println("This is Pug. " + d3);
        System.out.println(d3.Sit());
    }
}
