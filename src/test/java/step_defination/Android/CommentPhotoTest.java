package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class CommentPhotoTest extends Page {

    @Given("user click to like a photo")
    public void userClickToLikeAPhoto() {
        getCommentPhotoPage().getLikePhoto().click();
    }

}
