package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class AutoUploaderTest extends Page {

    @Then("click on auto-uploader")
    public void clickOnAutoUploader() {
        getAutoUploaderPage().getAutoUploader().click();
    }

}
