package lib.factory;

import lib.interfaces.IOMainPage;
import lib.pages.MainPage;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainPageFactory {
    public static IOMainPage get(RemoteWebDriver driver) {
        return new MainPage(driver);
    }
}
