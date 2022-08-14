package StrategyDesignPattern;

public abstract class PhoneCameraApp {
    public ShareStrategy shareStrategy;
    abstract void edit();
    public void take(){
        System.out.println("take photos");
    }
    public void save(){
        System.out.println("save photos");
    }

    public  void perFormSharing()
    {
        shareStrategy.share();
    }

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }
}
