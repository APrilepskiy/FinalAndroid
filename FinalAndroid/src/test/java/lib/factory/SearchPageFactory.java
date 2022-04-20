package lib.factory;

import lib.interfaces.IOSearchPage;
import lib.pages.SearchPage;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchPageFactory {

    public static IOSearchPage get(RemoteWebDriver driver) {
        return new SearchPage(driver);
    }
}
