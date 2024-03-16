package SimUDuckv5;

public class RedheadDuck extends Duck implements Quackable, Flayable {
    @Override
    public void quack() {
        System.out.println("Kwek!");
    }

    @Override
    public void fly() {
        System.out.println("Terbang");
    }
    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
