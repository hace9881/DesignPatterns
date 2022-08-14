package StrategyDesignPattern;

public class MiniDuckSimulator {
 public static void main(String[] args)
 {
     Duck mallard = new MallardDuck();
     mallard.performQuack();
     mallard.performFly();
     mallard.display();

     Duck  decoyDuck= new DecoyDuck();
     decoyDuck.performFly();
     decoyDuck.performQuack();
     decoyDuck.display();


     //The real advantage of implementing with interface is we can change behaviour on runtime.
     Duck squeakDuck = new SqueakDuck();
     squeakDuck.flyBehaviour = new FlyWithWings();
     squeakDuck.quackBehaviour = new Squeak();
     squeakDuck.performQuack();
     squeakDuck.performFly();
     squeakDuck.display();
 }
}
