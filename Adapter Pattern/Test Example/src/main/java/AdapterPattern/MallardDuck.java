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

    @Override
    public void swim() {
        System.out.println("Mallard duck is swimming");
    }
}
