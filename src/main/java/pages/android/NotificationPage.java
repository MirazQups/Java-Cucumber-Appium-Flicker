package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class NotificationPage {

    private String notification_bar = "com.flickr.android:id/fragment_navigation_notifications";

    public NotificationPage(Page page){

    }

    public WebElement getckickNotification() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(notification_bar));}
}
