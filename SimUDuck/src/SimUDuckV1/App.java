package SimUDuckV1;

public class App {
    public static void main(String[] args) {
        MalardDuck malard = new MalardDuck();

        System.out.println("================");
        malard.display();
        malard.quack();
        malard.swim();

        System.out.println("\n================");
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();

        System.out.println("\n================");
    }
}