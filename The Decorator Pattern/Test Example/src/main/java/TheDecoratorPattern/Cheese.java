package TheDecoratorPattern;

public class Cheese extends ToppingsDecorator {

    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+.50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", With Cheese";
    }
}
