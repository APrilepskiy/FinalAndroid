package lib.pages;

import lib.BasePage;
import lib.DriverSettings;
import lib.interfaces.IOArticlePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePage extends BasePage implements IOArticlePage {

    protected static String TITLE = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]";

    public ArticlePage(RemoteWebDriver driver) {
        super(driver);
    }

    public WebElement waitForTitleElement()
    {
        return this.waitForElementPresent(TITLE, "Cannot find article title on page", 15);
    }


}
