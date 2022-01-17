package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class CameraPage {

    private String clickCamera = "com.flickr.android:id/fragment_navigation_camera";

    public CameraPage(Page page){

    }

    public WebElement getClickOnCamera() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(clickCamera));}

}
