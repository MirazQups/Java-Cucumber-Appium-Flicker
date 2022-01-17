package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class GroupPageTest extends Page {

    @Then("click on groups")
    public void clickOnGroups() {
        getGroupPage().getckickGroup().click();
    }
}
