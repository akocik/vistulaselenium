package org.vistula.selenium.pages.pop;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(css = "input.gsc-input")
    private WebElement searchBar;

    @FindBy(css = "input.gsc-search-button")
    private WebElement searchButton;

    @FindBy(css = "h1")
    private WebElement post;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage isInitialized() {
        Assertions.assertThat(post.isDisplayed()).isTrue();
        return this;
    }

    public SearchResultsPage searchFor(String searchTerm) {
        searchBar.clear();
        searchBar.sendKeys(searchTerm);
        searchButton.click();
        return new SearchResultsPage(driver);
    }

}