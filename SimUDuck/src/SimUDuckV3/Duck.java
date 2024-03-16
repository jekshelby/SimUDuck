package SimUDuckV3;

public abstract class Duck {
    public void quack() {
        System.out.println("Kwek!");
    }

    public void swim() {
        System.out.println("Berenang");
    }
    
    public void fly() {
        System.out.println("Terbang");
    }

    public abstract void display();
}