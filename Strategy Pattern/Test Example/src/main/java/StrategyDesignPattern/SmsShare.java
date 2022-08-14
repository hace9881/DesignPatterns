package StrategyDesignPattern;

public class SmsShare implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("you are sharing through sms");
    }
}
