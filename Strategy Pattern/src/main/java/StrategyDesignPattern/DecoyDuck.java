package StrategyDesignPattern;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
//        quackBehaviour = new Mute();
    }

    @Override
    void display() {
        System.out.println("I am a decoy duck buhuhu");
    }
}
