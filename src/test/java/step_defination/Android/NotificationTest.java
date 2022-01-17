package step_defination.Android;

import io.cucumber.java.en.Given;
import pages.Page;

public class NotificationTest extends Page {

    @Given("user click on notification bar")
    public void userClickOnNotificationBar() {
        getNotificationPage().getckickNotification().click();
    }

}
