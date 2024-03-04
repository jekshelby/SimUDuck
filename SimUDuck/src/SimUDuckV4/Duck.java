package SimUDuckV4;

public abstract class Duck {
    public String quack() {
        return "Kwek";
    }

    public String swim() {
        return "berenang";
    }

    public String fly() {
        return "terbang";
    }

    public abstract void display();
}
