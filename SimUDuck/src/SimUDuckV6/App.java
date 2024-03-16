package SimUDuckV6;

public class App {
    public static void main(String[] args) {
        System.out.println("================");
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.SetQuackBehavior(new Quack());
        mallard.PrformQuack();
        mallard.SetFlyBehvior(new Flywithwings());
        mallard.PerformFly();

        System.out.println("\n================");
        RedheadDuck redhead = new RedheadDuck();
        redhead.display();
        redhead.swim();
        redhead.SetQuackBehavior(new Quack());
        redhead.PrformQuack();
        redhead.SetFlyBehvior(new Flywithwings());
        redhead.PerformFly();

        System.out.println("\n================");
        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.SetQuackBehavior(new Squeak());
        rubber.PrformQuack();
        rubber.SetFlyBehvior(new Flynoway());
        rubber.PerformFly();

        System.out.println("\n================");
        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();
        decoy.SetQuackBehavior(new QuackMute());
        decoy.PrformQuack();
        decoy.SetFlyBehvior(new Flynoway());
        decoy.PerformFly();

        System.out.println("\n================");
        ModelDuck modal = new ModelDuck();
        modal.display();
        modal.swim();
        modal.SetFlyBehvior(new Flywithrocket());
        modal.PerformFly();

        System.out.println("\n================");
    }
}