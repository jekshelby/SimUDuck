package SimUDuckV4;

public class RubberDuck extends Duck {
    @Override
    public String quack() {
        return "Berdecit(tidak quack)";
    }

    @Override
    public String fly() {
        return "Tidak Bisa Terbang";
    }
    @Override
    public void display() {
        System.out.println("Rubber Duck");
        System.out.println(quack());
        System.out.println(swim());
        System.out.println(fly());
    }
}
