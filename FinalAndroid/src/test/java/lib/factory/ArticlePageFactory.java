package lib.factory;

import lib.interfaces.IOArticlePage;
import lib.pages.ArticlePage;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePageFactory {
    public static IOArticlePage get(RemoteWebDriver driver) {
        return new ArticlePage(driver);
    }
}
