package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class TrackViewsTest extends Page {

    @Then("click on stats")
    public void clickOnStats() {
        getTrackViews().getClickStats().click();
    }

}
