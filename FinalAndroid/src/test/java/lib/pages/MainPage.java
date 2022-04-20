package lib.pages;

import lib.BasePage;
import lib.interfaces.IOMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;


public class MainPage extends BasePage implements IOMainPage {

    final static String INIT_SEARCH = "id:org.wikipedia:id/search_container";

    public MainPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearch() {
        WebElement searchInit = this.waitForElementPresent(INIT_SEARCH,
                "Cannot find element");
        searchInit.click();
    }

}
