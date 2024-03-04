package SimUDuckV2;

public class MalardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Mallard Duck");
        System.out.println(quack());
        System.out.println(swim());
        System.out.println(fly());
        
    }
}
