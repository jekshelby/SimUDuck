package SimUDuckV6;

public abstract class Duck {
    Flybehavior flybehavior;
    Quackbehavior quackbehavior;

    public Duck(){
    }

    public abstract void display();

    public void PerformFly() {
        flybehavior.fly();
    }

    public void PrformQuack() {
        quackbehavior.quack();
    }

    public void swim() {
        System.out.println("Berenang");
    }

    public void SetFlyBehvior(Flybehavior fhb) {
        flybehavior = fhb;
    }

    public void SetQuackBehavior(Quackbehavior qhb) {
        quackbehavior = qhb;
    }
}
