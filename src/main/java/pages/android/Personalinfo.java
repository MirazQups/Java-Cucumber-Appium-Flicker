package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class Personalinfo {

    public String clickProfile = "com.flickr.android:id/fragment_navigation_profile";
    public String clickThreeDot = "com.flickr.android:id/profile_header_overflow";
    public String clickonabout = "com.flickr.android:id/profile_settings_about";

    public Personalinfo(Page page){

    }

    public WebElement getClickProfile() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickProfile));}
    public WebElement getClickThreedot() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickThreeDot));}
    public WebElement getClickOnAbout() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickonabout));}


}
