package StrategyDesignPattern;

public class SocialMediaShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("you are sharing through social media");
    }
}
