package SimUDuckv5;

public class App {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        System.out.println("================");
        mallard.display();
        mallard.swim();
        mallard.quack();
        mallard.fly();

        System.out.println("\n================");
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();
        redhead.swim();
        redhead.quack();
        redhead.fly();

        System.out.println("\n================");
        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();

        System.out.println("\n================");
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();

        System.out.println("\n================");
    }
}