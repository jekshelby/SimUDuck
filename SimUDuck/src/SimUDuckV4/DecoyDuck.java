package SimUDuckV4;

public class DecoyDuck extends Duck {
    @Override
    public String quack() {
        return "";
    }

    @Override
    public String fly() {
        return "Tidak Bisa Terbang";
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
        System.out.println(quack());
        System.out.println(swim());
        System.out.println(fly());
    }
}
