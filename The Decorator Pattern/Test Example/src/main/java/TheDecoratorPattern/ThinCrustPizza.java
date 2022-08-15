package TheDecoratorPattern;

public class ThinCrustPizza extends Pizza{


    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
