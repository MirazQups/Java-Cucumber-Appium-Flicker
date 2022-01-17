package step_defination.Android;

import io.cucumber.java.en.Then;
import pages.Page;

public class AlbumTest extends Page {

    @Then("click album")
    public void clickAlbum() {
        getAlbumPage().getAlbum().click();
    }

}
