package SimUDuckV4;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Berdecit (Tidak Quack)");
    }

    @Override
    public void fly() {
        System.out.println("Tidak Bisa terbang");
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}