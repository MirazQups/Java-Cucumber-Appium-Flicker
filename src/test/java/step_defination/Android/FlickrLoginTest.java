package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class FlickrLoginTest extends Page {

    @Given("user click on get started")
    public void getStarted(){
        getFlickrLoginPage().getStarted().click();
        getFlickrLoginPage().gotoLogPage().sendKeys("marazislam8@gmail.com");
    }

    @Then("click on next btn")
    public void clickOnNextBtn() {
        getFlickrLoginPage().clickNextBtn().click();
        getFlickrLoginPage().enterPass().sendKeys("TestCase0101");
        getFlickrLoginPage().clickSignIN().click();
    }
}
