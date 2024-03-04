package SimUDuckV4;

public class App {
    public static void main(String[] args) {
        MalardDuck malard = new MalardDuck();
        malard.display();

        System.out.println("================");
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();

        System.out.println("================");
        RubberDuck rubber = new RubberDuck();
        rubber.display();

        System.out.println("================");
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
    }
}