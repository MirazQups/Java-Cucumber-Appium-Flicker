package core.utils;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Wait {

    public static WebDriverWait wait;

    public static WebDriverWait getWaitDriver() throws IOException {
        if(wait==null) {
            //int timeout = Integer.parseInt(ReadConfigFiles.readProps().getProperty("explicitTimeout"));
            int timeout = 40;
            wait = new WebDriverWait(WebConnector.driver,timeout);
        }
        return wait;
    }

    public static WebDriverWait getWaitAndroidDriver() throws IOException {
        if(wait==null) {
            //int timeout = Integer.parseInt(ReadConfigFiles.readProps().getProperty("explicitTimeout"));
            int timeout = 40;
            wait = new WebDriverWait(AndroidDriverSetup.getAndroidDriver(),timeout);
        }
        return wait;
    }

}