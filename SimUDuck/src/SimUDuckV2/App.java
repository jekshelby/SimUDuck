package SimUDuckV2;

public class App {
    public static void main(String[] args) {
        MalardDuck malard = new MalardDuck();

        System.out.println("================");
        malard.display();
        malard.quack();
        malard.swim();
        malard.fly();

        System.out.println("\n================");
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
        redhead.fly();

        System.out.println("\n================");
    }
}