package lib.interfaces;

public interface IOSearchPage {

    void findByText(String text);
    void selectByText(String text);
    void initSearchInput();
    void typeSearchLine(String java);
    void waitForSearchResult(String s);
    int getAmountOfFoundArticles();
    void waitForEmptyResultsLabel();
    void assertThereIsNoResultOfSearch();
    void clickByArticleWithSubstring(String s);
}
