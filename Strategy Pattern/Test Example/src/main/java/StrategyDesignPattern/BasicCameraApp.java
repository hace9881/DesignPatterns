package StrategyDesignPattern;

public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        shareStrategy = new SmsShare();
    }

    @Override
    void edit() {
        System.out.println("editing in basic camera app");
    }
}
