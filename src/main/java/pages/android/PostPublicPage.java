package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PostPublicPage {

    private String clickOnpublic = "(//android.widget.TextView)[8]";

    public PostPublicPage (Page page){

    }

    public WebElement getAlbum() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(clickOnpublic));}

}
