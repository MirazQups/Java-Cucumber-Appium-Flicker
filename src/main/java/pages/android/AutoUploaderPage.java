package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class AutoUploaderPage {

    private String clickautoUpload = "com.flickr.android:id/profile_settings_auto_uploadr";

    public AutoUploaderPage(Page page){

    }

    public WebElement getAutoUploader() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickautoUpload));}

}
