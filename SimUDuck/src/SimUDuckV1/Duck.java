package SimUDuckV1;

public abstract class Duck {
    public String quack() {
        return "Kwek";
    }

    public String swim() {
        return "berenang";
    }

    public abstract void display();
}