package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class SignUpPage {

    private String getstarted = "com.flickr.android:id/activity_welcome_sign_button";
    private String clickSignUp = "//android.view.View[@content-desc=\"Sign up here.\"]/android.widget.TextView";
    private String first_name = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText";
    private String last_name = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText";
    private String age = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText";
    private String email_add = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.widget.EditText";
    private String password = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]/android.view.View/android.widget.EditText";
    private String clickSignupBtn = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public SignUpPage(Page page){

    }

    public WebElement getStarted() {return AndroidDriverSetup.getAndroidDriver().findElement(By.id(getstarted));}
    public WebElement clickSignup() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(clickSignUp));}
    public WebElement getFirstName() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(first_name));}
    public WebElement getLastName() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(last_name));}
    public WebElement getAge() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(age));}
    public WebElement getEmailAdd() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(email_add));}
    public WebElement getpass() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(password));}
    public WebElement getclickSignUpBtn() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(password));}


}
