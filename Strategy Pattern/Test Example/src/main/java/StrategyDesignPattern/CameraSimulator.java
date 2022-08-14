package StrategyDesignPattern;

public class CameraSimulator {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.edit();
        basicCameraApp.perFormSharing();

        PhoneCameraApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.setShareStrategy(new SocialMediaShare()
        );
        cameraPlusApp.perFormSharing();
        cameraPlusApp.edit();
    }
}
