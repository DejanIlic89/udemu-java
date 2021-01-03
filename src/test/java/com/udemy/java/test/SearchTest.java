package com.udemy.java.test;

import com.udemy.java.pages.SearchPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class SearchTest extends BaseTest {

    private SearchPage searchPage;

    @BeforeTest
    public void pageSetup() {
        this.searchPage = new SearchPage(driver);
    }

    @Test
    public void launchSite() {
        this.searchPage.goTo();
        assertThat(this.searchPage).isAt();
        assertThat(this.searchPage).titleContains("DuckDuckGo");
    }

    @Test(dependsOnMethods = "launchSite")
    public void keywordTest() {
        this.searchPage.search("vinsguru");
        assertThat(this.searchPage.getSearchBox())
                .isDisplayed()
                .isEnabled()
                .hasAttributeValue("value", "vinsguru");
    }


//    @Test
//    public void launchSite() {
//        this.searchPage.goTo();
//        assertThat(this.searchPage).isAt();
//
//        final WebElement element = this.searchPage.getSearchBox();
//
//        assertThat(element)
//                .isDisplayed()
//                .isEnabled()
//                .hasAttributeValue("placeholder", "Search the web without being tracked");
//
//    }


}
