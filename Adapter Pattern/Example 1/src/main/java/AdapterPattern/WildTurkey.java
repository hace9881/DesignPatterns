package AdapterPattern;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("am gobbling turkey");
    }

    @Override
    public void fly() {
        System.out.println("am flying turkey");
    }
}
