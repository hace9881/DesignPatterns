package AdapterPattern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("am Mallard duck am quacking");
    }

    @Override
    public void fly() {
        System.out.println("am Mallard duck am flying");
    }
}
