package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class PersonalinfoTest extends Page {

    @Given("click on profile icon")
    public void clickOnProfileIcon() {
        getPersonalinfo().getClickProfile().click();
    }

    @Then("click on profile three dot icon")
    public void clickOnProfileThreeDotIcon() {
        getPersonalinfo().getClickThreedot().click();
    }

    @Then("click on about")
    public void clickOnAbout() {
        getPersonalinfo().getClickOnAbout().click();
    }

}
