package com.udemy.java.test;

import com.udemy.java.predicate.Rules;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.List;
import java.util.function.Predicate;

public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    /**
     * Do not allow blank links
     * do not allow links containing s
     * convert link text to uppercase
     * print on the console
     */

    @Test
    public void googleTest() {
        this.driver.get("https://google.com/");

        Reporter.log("Launch the site");

        this.driver.findElements(By.tagName("a"))
                .stream()
                .map(e -> e.getText().toUpperCase().trim())
                .filter(e -> e.length() > 0)
                .filter(e -> !e.contains("S"))
                .forEach(System.out::println);

//                .filter(e -> e.getText().trim().length() > 0)
//                .filter(e -> !e.getText().toLowerCase().contains("s"))
//                .map(e -> e.getText().toUpperCase())
//                .forEach(System.out::println);



        //without streams
//        final List<WebElement> elements = this.driver.findElements(By.tagName("a"));
//                .forEach(e -> System.out.println(e.getText()));

////        Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
////        Predicate<WebElement> hasS = (e) -> e.getText().toLowerCase().contains("s");
//
//        System.out.println("Before :: " + elements.size());
//
////        elements.removeIf(isBlank.or(hasS));
//
//        Rules.get().forEach(elements::removeIf);
//
//        System.out.println("After :: " + elements.size());
//
//        elements.forEach(e -> System.out.println(e.getText()));
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }

}
