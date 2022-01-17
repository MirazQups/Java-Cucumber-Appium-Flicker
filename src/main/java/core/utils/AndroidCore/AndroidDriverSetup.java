package core.utils.AndroidCore;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class AndroidDriverSetup {

    private static AndroidDriver<AndroidElement> androidDriver;

    public static void androidDriver(String port) throws IOException {
        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), CapabilitiesGenerator.getAndroidCapabilities());
        androidDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        System.out.println("Android driver selected:\n");
    }

    public static void quitAndroidDriver() {
        try {
            AndroidDriverSetup.getAndroidDriver().removeApp("io.appium.uiautomator2.server");
            AndroidDriverSetup.getAndroidDriver().removeApp("io.appium.uiautomator2.server.test");
            AndroidDriverSetup.getAndroidDriver().removeApp("io.appium.settings");
            AndroidDriverSetup.getAndroidDriver().removeApp("io.appium.unlock");
            AppiumServerRunner.stopServer();
            if (AndroidDriverSetup.androidDriver != null) {
                androidDriver.quit();
                androidDriver = null;
            } else {
                System.out.println("TestCases Flow");
            }
        }
        catch (Exception e){
            System.out.println("Error While Executing the  Quite Driver");
        }
    }

    public static AndroidDriver<AndroidElement> getAndroidDriver() {
        if (androidDriver != null) {
            return androidDriver;
        } else {
            System.out.println("TestCases Flow");
                throw new IllegalStateException("Driver has not been initialized. " +
                        "Please call WebDriverFactory before use this method");
        }
    }

    public static void moveAppInBackground(){
        AndroidDriverSetup.androidDriver.runAppInBackground(Duration.ofSeconds(10));;
    }

    public static void toggleWifi(){
        AndroidDriverSetup.androidDriver.toggleWifi();
    }

    public static void killApp() throws InterruptedException {
        AndroidDriverSetup.androidDriver.terminateApp("");
    }

    public static void launchApp() throws InterruptedException {
        Thread.sleep(3000);
        try{AndroidDriverSetup.androidDriver.activateApp("");}catch (Exception e) {
        }
    }

    public static void killApplicationAndOpenApp() throws InterruptedException {
         // drive.closeApp();
        AndroidDriverSetup.androidDriver.terminateApp("co.foree.app.release");
        // start app
       Thread.sleep(10000);
//       driver.launchApp();
        try{AndroidDriverSetup.androidDriver.activateApp("co.foree.app.release");}catch (Exception e) {
        }
    }

    public static void verifyValidFingerPrint(){
        AndroidDriverSetup.androidDriver.fingerPrint(1);
    }

    public static void verifyInValidFingerPrint(){
        AndroidDriverSetup.androidDriver.fingerPrint(2);
    }

    public static void moveAppInForeground() throws InterruptedException{
        String appPackage = "";
        String screenActivity = "";
        Thread.sleep(5000);
        AndroidDriverSetup.androidDriver.startActivity(new Activity(appPackage, screenActivity));
    }

//    public static List<DeviceDetails> getDevices(){
//        List<DeviceDetails> androidDevices = new Android().getDevices();
//        System.out.println("Android Devices list : " + androidDevices);
//        return androidDevices;
//    }

}
