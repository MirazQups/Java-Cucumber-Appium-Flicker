package pages.android;

import core.utils.AndroidCore.AndroidDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class AlbumPage {

    public String album= "(//android.widget.TextView)[7]";

    public AlbumPage(Page page){

    }

    public WebElement getAlbum() {return AndroidDriverSetup.getAndroidDriver().findElement(By.xpath(album));}

}
