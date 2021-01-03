package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.regex.Pattern;
//assignment3
public class HoverableDropdownTest {

    private WebDriver driver;
    private Actions actions;

//    Consumer<By> hover = (By by) -> {
//        actions.moveToElement(driver.findElement(by)).perform();
//    };

    @Test(dataProvider = "linkProvider")
    public void dropdownTest(String path) {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/drop-down.html");
        var split = path.split("=>");

//        Pattern.compile("=>")
//                .splitAsStream(path)
//                .map(String::trim)
//                .map(By::linkText)
//                .forEach(hover);

        Arrays.stream(split)
                .map(s -> s.trim())
                .map(s -> By.linkText(s))
                .map(by -> driver.findElement(by))
                .map(ele -> actions.moveToElement(ele))
                .forEach(a -> a.perform());

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @DataProvider(name = "linkProvider")
    public Object[] testData() {
        return new Object[] {
                "Dropdown => Dropdown Link 2",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.1",
                "Dropdown => Dropdown Link 5 => Dropdown Submenu Link 5.4 => Dropdown Submenu Link 5.4.2"
        };
    }

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
        this.actions = new Actions(driver);
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }

}
