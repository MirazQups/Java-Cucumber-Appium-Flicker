package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class CommentPhotoPage {

    private String commentphoto = "(//android.view.View)[2]";

    public CommentPhotoPage(Page page){

    }

    public WebElement getLikePhoto() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(commentphoto));}

}
