package TheDecoratorPattern;

public class TheDecoratorSimulator {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() +" $"+pizza.cost());

    }
}
