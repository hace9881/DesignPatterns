package StrategyDesignPattern;

public class MallardDuck extends Duck{


    public MallardDuck()
    {
//        super();
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am the real Mallard Duck");
    }

}
