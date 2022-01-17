package pages.ios;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class LoginPage {

    private String LOGOUT_BUTTON_CSS =".mat-stroked-button span";
    private String HAMBURGER_CSS = "button.material-icons";

    public LoginPage(Page page) {
    }

    public WebElement getLogoutButton() { return  WebConnector.driver.findElement(By.cssSelector(LOGOUT_BUTTON_CSS)); }
    public WebElement getHamburgerButton() { return  WebConnector.driver.findElement(By.cssSelector(HAMBURGER_CSS)); }

}
