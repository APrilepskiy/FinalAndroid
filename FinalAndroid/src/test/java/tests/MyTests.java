package tests;

import lib.DriverSettings;
import lib.factory.ArticlePageFactory;
import lib.factory.MainPageFactory;
import lib.factory.SearchPageFactory;
import lib.interfaces.IOArticlePage;
import lib.interfaces.IOMainPage;
import lib.interfaces.IOSearchPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MyTests extends DriverSettings {

    //поиск статьи java и выбор по тексту
    @Test
    public void testFindJava() {

        IOSearchPage searchPage = SearchPageFactory.get(this.driver);
        IOMainPage mainPageObject = MainPageFactory.get(this.driver);

        mainPageObject.initSearch();
        searchPage.findByText("Java");
        searchPage.selectByText("Island of Indonesia");

    }

    //поиск статьи с последующим сворачиваем приложения
    @Test
    public void testCheckSearchArticleInBackground()
    {
        IOSearchPage searchPageObject = SearchPageFactory.get(this.driver);

        searchPageObject.initSearchInput();
        searchPageObject.typeSearchLine("Java");
        searchPageObject.waitForSearchResult("Object-oriented programming language");
        this.backgroundApp(2);
        searchPageObject.waitForSearchResult("Object-oriented programming language");
    }

    @Test
    public void testAmountOfNotEmptySearch() {
        IOSearchPage searchPageObject = SearchPageFactory.get(this.driver);

        searchPageObject.initSearchInput();
        String search_line = "C++";
        searchPageObject.typeSearchLine(search_line);
        int amount_of_search_result = searchPageObject.getAmountOfFoundArticles();

        assertTrue(
                "We found too few results",
                amount_of_search_result > 0
        );
    }

    @Test
    public void testAmountOfEmptySearch() {
        IOSearchPage searchPageObject = SearchPageFactory.get(this.driver);

        searchPageObject.initSearchInput();
        String search_line = "jhsdjfhskdhf";
        searchPageObject.typeSearchLine(search_line);
        searchPageObject.waitForEmptyResultsLabel();
        searchPageObject.assertThereIsNoResultOfSearch();
    }


}
