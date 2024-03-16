package SimUDuckV5;

public class MallardDuck extends Duck implements Quackable, Flyable {
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
        System.out.println("Mallard Duck");
    }
}