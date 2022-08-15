package TheDecoratorPattern;

public class Olives extends ToppingsDecorator {

    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+.50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", With Olives";
    }
}
