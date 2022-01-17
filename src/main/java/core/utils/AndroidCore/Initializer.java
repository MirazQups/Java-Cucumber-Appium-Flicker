package core.utils.AndroidCore;

public class Initializer {

    public static void moveAppInBackground() {
        AndroidDriverSetup.moveAppInBackground();
    }

    public static void moveAppInBackgroundFor10sec() {
        AndroidDriverSetup.moveAppInBackground();

    }

    public static void toggleWifi() {
        AndroidDriverSetup.toggleWifi();

    }

    public static void killApplicationAndOpenApp() throws InterruptedException {
        AndroidDriverSetup.killApplicationAndOpenApp();
    }

    public static void killApplication() throws InterruptedException {
        AndroidDriverSetup.killApp();

    }

    public static void launchApp() throws InterruptedException {
        AndroidDriverSetup.launchApp();
    }

    public static void verifyValidFingerPrint() {
        AndroidDriverSetup.verifyValidFingerPrint();
    }

    public static void verifyInvalidFingerPrint() {
        AndroidDriverSetup.verifyInValidFingerPrint();
    }

    public static void moveAppInForeground() throws InterruptedException {
        AndroidDriverSetup.moveAppInForeground();
    }

}
