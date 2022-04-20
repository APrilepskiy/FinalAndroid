package lib.pages;

import lib.BasePage;
import lib.DriverSettings;
import lib.interfaces.IOArticlePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePage extends BasePage implements IOArticlePage {

    protected static String TITLE = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]";
    protected static String FOOTER_ELEMENT = "xpath://*[@text='View page in browser']";
    protected static String OPTION_BUTTON = "xpath://android.widget.ImageView[@content-desc='More options']";
    protected static String OPTION_ADD_TO_MY_LIST_BUTTON = "xpath://*[@text='Add to reading list']";
    protected static String ADD_TO_MY_LIST_OVERLAY = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]";
    protected static String MY_LIST_NAME_INPUT = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText";
    protected static String MY_LIST_OK_BUTTON = "xpath://*[@text='OK']";
    protected static String CLOSE_ARTICLE_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
    protected static String CREATED_FOLDER_NAME_TPL = "xpath://*[@text='{NAME_OF_EXIST_FOLDER}']";


    public ArticlePage(RemoteWebDriver driver) {
        super(driver);
    }

    public WebElement waitForTitleElement()
    {
        return this.waitForElementPresent(TITLE, "Cannot find article title on page", 15);
    }


}
