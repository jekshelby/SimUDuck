package SimUDuckV4;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Tidak Kwek");
    }

    @Override
    public void fly() {
        System.out.println("Tidak Bisa terbang");
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
