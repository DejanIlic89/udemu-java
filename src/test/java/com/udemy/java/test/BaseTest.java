package com.udemy.java.test;

import com.udemy.java.assertion.PageAssert;
import com.udemy.java.assertion.WebElementAssert;
import com.udemy.java.pages.BasePage;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    protected WebElementAssert assertThat(WebElement element) {
        return WebElementAssert.assertThat(element);
    }

    protected PageAssert assertThat(BasePage page) {
        return PageAssert.assertThat(page);
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
