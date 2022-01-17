package core.utils.AndroidCore;

import core.utils.ConfigUtil;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

    private static WebDriverWait wait = null;
    private static long timeInSeconds = Long.valueOf(ConfigUtil.getConfig("environment").getProperty("TimeoutInSeconds"));

    public static WebDriverWait WaitForElement() {
        if(wait == null) {
            return new WebDriverWait(AndroidDriverSetup.getAndroidDriver(),20);
        }
        else {
            return wait;
        }
    }

    public static WebDriverWait WaitForElement10sec() {
        if(wait == null) {
            return new WebDriverWait(AndroidDriverSetup.getAndroidDriver(),10);
        }
        else {
            return wait;
        }
    }

    public static WebDriverWait WaitForElement5sec() {
        if(wait == null) {
            return new WebDriverWait(AndroidDriverSetup.getAndroidDriver(),5);
        }
        else {
            return wait;
        }
    }
}
