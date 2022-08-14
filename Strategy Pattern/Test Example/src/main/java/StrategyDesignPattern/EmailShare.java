package StrategyDesignPattern;

public class EmailShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("you are sharing through email");
    }
}
