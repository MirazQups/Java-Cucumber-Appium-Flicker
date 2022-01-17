package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class PostPublicTest extends Page {

    @Then("click on public")
    public void clickOnPublic() {
        getPostPublicPage().getAlbum().click();
    }
}
