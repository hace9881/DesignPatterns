package TheDecoratorPattern;

public abstract class Pizza {
    String description = "Unknown pizza";
    public  abstract  double cost();

    public String getDescription() {
        return description;
    }
}
