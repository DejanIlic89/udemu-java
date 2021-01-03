package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.pages.TableDemoPage;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class CheckboxSelectionTest {

    private WebDriver driver;
    private TableDemoPage tableDemoPage;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
        this.tableDemoPage = new TableDemoPage(driver);
    }

    @Test(dataProvider = "criteriaProvider")
    public void tableRowTest(Predicate<List<WebElement>> searchCriteria) {
        tableDemoPage.goTo();
        tableDemoPage.selectRows(searchCriteria);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

//    @Test(dataProvider = "gender")
//    public void tableRowTest(String gender) {
//        tableDemoPage.goTo();
//        tableDemoPage.selectRows(gender);
//        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
//    }

    @DataProvider(name = "criteriaProvider")
    public Object[] testDataProvider() {
        return new Object[] {
                SearchCriteriaFactory.getCriteria("allMale"),
                SearchCriteriaFactory.getCriteria("allFemale"),
                SearchCriteriaFactory.getCriteria("allGender"),
                SearchCriteriaFactory.getCriteria("allAU"),
                SearchCriteriaFactory.getCriteria("allFemaleAU")
        };
    }

    @DataProvider(name = "gender")
    public Object[] testData() {
        return new Object[] {
                "male",
                "female"
        };
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
