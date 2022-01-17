package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class SharePage {

    String shareBtn = "com.flickr.android:id/fragment_navigation_search";
    String clickSharetoggle = "com.flickr.android:id/fragment_navigation_search_bar";
    String searchbook = "com.flickr.android:id/search_view_autocompl_textview";

    public SharePage(Page page){

    }

    public WebElement getShareBtn() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(shareBtn));}
    public WebElement getclickSharetoggle() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickSharetoggle));}
    public WebElement getSharebook() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(searchbook));}
}
