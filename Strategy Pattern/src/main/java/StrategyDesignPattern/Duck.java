package StrategyDesignPattern;

public abstract class Duck {
     public FlyBehaviour flyBehaviour;
     public QuackBehaviour quackBehaviour;
     abstract void display();

    public Duck() {
    }


    public void performFly() {
        if(flyBehaviour!=null)
        {
            flyBehaviour.fly();
        }
    }

    public void performQuack() {
        if(quackBehaviour!=null)
        {
            this.quackBehaviour.quack();
        }

    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
