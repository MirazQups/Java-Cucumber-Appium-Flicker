package step_defination.Android;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Page;

public class ShareTest extends Page {

    @Given("click on search btn")
    public void click_search(){
        getSharePage().getShareBtn().click();
    }

    @Then("enter any book name {string}")
    public void enterAnyBookName(String bookname) {
        getSharePage().getShareBtn().click();
        getSharePage().getclickSharetoggle().click();
        getSharePage().getSharebook().sendKeys(bookname);
    }


}
