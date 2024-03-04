package SimUDuckV2;

public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Redhead Duck");
        System.out.println(quack());
        System.out.println(swim());
        System.out.println(fly());
    }
}