package core.utils.AppiumHook;

import core.utils.ConfigUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import me.alexpanov.net.FreePortFinder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MobileConnector {

    private static AndroidDriver driver;
    public static IOSDriver iosDriver;
    private static AppiumServiceBuilder builder;
    private static WebDriverWait wait;

    public static Properties myProp = ConfigUtil.getConfig("config");

    static AppiumServerRunner asr;{
        asr = new AppiumServerRunner();
    }

    public static void killProcess(int port) throws IOException {
        try{
            ProcessBuilder processBuilder = new ProcessBuilder();
            // -- Linux --
            // Run a shell command
            processBuilder.command("bash", "-c", "sudo lsof -t -i tcp:4723 | xargs kill");
            // Run a shell script
            //processBuilder.command("path/to/hello.sh");
            // -- Windows --
            // Run a command
            //processBuilder.command("cmd.exe", "/c", "dir C:\\Users\\mkyong");
            // Run a bat file
            //processBuilder.command("C:\\Users\\mkyong\\hello.bat");
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }
            int exitVal = process.waitFor();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something Went wrong with server");
        }
    }

    public static void startIosDriver() throws MalformedURLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (iosDriver == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.UDID,myProp.getProperty("udid"));
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME,myProp.getProperty("platformnameios"));
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,myProp.getProperty("platformversionios"));
            cap.setCapability(MobileCapabilityType.APP,myProp.getProperty("app"));
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, myProp.getProperty("automationname"));
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,myProp.getProperty("devicename"));
            cap.setCapability("xcodeSigningId", myProp.getProperty("xcodeSigningId"));
//            cap.setCapability("fullReset",true);
            cap.setCapability("fullReset",myProp.getProperty("fullReset"));
            cap.setCapability("xcodeOrgId", myProp.getProperty("xcodeSigningId"));
            iosDriver = new IOSDriver<MobileElement>(new URL(myProp.getProperty("appiumserver")), cap);
            iosDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public static void startIosDriver(String UDID, String platformVersion, String platform) throws MalformedURLException {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (iosDriver == null) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.UDID,UDID);
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME,platform);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
            cap.setCapability(MobileCapabilityType.APP,myProp.getProperty("app"));
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, myProp.getProperty("automationname"));
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,myProp.getProperty("devicename"));
            cap.setCapability("xcodeSigningId", myProp.getProperty("xcodeSigningId"));
            cap.setCapability("noReset", false);
            cap.setCapability("newCommandTimeout",90000);
//            cap.setCapability("fullReset",true);
            //cap.setCapability("fullReset",myProp.getProperty("fullReset"));
            cap.setCapability("xcodeOrgId", myProp.getProperty("xcodeSigningId"));
            iosDriver = new IOSDriver<MobileElement>(new URL(myProp.getProperty("appiumserver")), cap);
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        else {
            iosDriver.resetApp();
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

    public static void startIosDriver(String UDID, String platformVersion, String platform, String port) throws IOException  {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (iosDriver == null) {
            int portForWda = FreePortFinder.findFreeLocalPort();
            killAllProccess(portForWda);
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.UDID,UDID);
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME,platform);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
            cap.setCapability(MobileCapabilityType.APP,myProp.getProperty("app"));
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, myProp.getProperty("automationname"));
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,myProp.getProperty("devicename"));
            cap.setCapability("xcodeSigningId", myProp.getProperty("xcodeSigningId"));
            cap.setCapability("newCommandTimeout",90000);
            cap.setCapability("wdaLocalPort", portForWda);
            cap.setCapability("xcodeOrgId", myProp.getProperty("xcodeSigningId"));
            cap.setCapability("useNewWDA", true);
            cap.setCapability("noReset",false);

            iosDriver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:"+port+"/wd/hub"), cap);
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        else {
            iosDriver.resetApp();
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
    }

    private static void killAllProccess(int port) throws IOException {
        String command = "kill $(sudo lsof -t -i:"+port+")";
        Process p = Runtime.getRuntime().exec(command);
        p.destroyForcibly();
    }
}

