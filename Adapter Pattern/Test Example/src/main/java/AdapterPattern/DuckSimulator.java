package AdapterPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        testDuck(duck);
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
        SuperDrone superDrone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(superDrone);
        testDuck(droneAdapter);

    }

    static void testDuck(Duck duck)
    {
        duck.quack();
        duck.fly();
        duck.swim();
    }
}
