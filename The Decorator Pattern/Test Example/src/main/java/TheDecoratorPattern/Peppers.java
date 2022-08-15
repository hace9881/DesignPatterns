package TheDecoratorPattern;

public class Peppers extends ToppingsDecorator {

    Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+.50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", With Peppers";
    }
}
