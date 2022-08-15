package TheDecoratorPattern;

public class ThickCrustPizza extends Pizza{

    public String getDescription() {
        return "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
