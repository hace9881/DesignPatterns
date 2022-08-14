package StrategyDesignPattern;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack()
    {
        System.out.println("I am squeaking");
    }
}
