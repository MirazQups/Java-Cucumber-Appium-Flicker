package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebElement waitForElement(WebElement element) {
        new FluentWait<>("")
                .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(400))
                .ignoring(StaleElementReferenceException.class, NullPointerException.class)
                .until(a -> element.isDisplayed() && element.isEnabled());
        return element;
    }

    public List<AndroidElement> waitForElementList(List<AndroidElement> elements) {
        new FluentWait<>("")
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(400))
                .ignoring(StaleElementReferenceException.class, NullPointerException.class)
                .until(a -> elements.get(0).isDisplayed());
        return elements;
    }

    public boolean isElementPresent(By locator) {
        return AndroidDriverSetup.getAndroidDriver().findElements(locator).size() > 0;
    }
}
