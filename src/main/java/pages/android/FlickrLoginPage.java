package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class FlickrLoginPage {

    private String getstarted = "com.flickr.android:id/activity_welcome_sign_button";
    private String gotologPage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText";

    private String nextBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";
    private String enterpass = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText";
    private String signInbtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";


    public FlickrLoginPage(Page page){

    }

    public WebElement getStarted() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(getstarted));}
    public WebElement gotoLogPage() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(gotologPage));}
    public WebElement clickNextBtn() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(nextBtn));}
    public WebElement enterPass(){return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(enterpass));}
    public WebElement clickSignIN(){return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(signInbtn));}

}
