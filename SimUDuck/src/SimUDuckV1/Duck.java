package SimUDuckV1;

public abstract class Duck {
    public void quack() {
        System.out.println("Kwek!");
    }

    public void swim() {
        System.out.println("Berenang");
    }

    public abstract void display();
}