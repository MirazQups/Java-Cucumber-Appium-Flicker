package step_defination.web;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Page;

import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;
import static core.utils.AndroidCore.AndroidDriverSetup.quitAndroidDriver;
import static core.utils.AndroidCore.AppiumServerRunner.StartAppiumServer;
import static step_defination.Android.AndroidSetup.PORT;

public class MainPage extends Page {


    @Before("@initial")
    public void startTestAndroid() throws Exception {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
            PORT = myProp.getProperty("appiumport");
            StartAppiumServer(PORT);
            androidDriver(PORT);
        }
    }


    @After("@final")
    public void afterTestAndroid() {
        if (myProp.getProperty("platformname").toString().equals("Android")) {
            quitAndroidDriver();
        }
    }


}
