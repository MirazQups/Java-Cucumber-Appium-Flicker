package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class CameraTest extends Page {

    @Given("user click on camera icon")
    public void userClickOnCameraIcon() {
        getCameraPage().getClickOnCamera().click();
    }

}
