package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.assignment4.PaymentScreenPage;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static com.udemy.java.test.PaymentScreenActions.*;

public class PaymentScreenTest {

    private WebDriver driver;
    private PaymentScreenPage paymentScreenPage;

    @Test(dataProvider = "testScenarios")
    public void paymentScreenPage(Consumer<PaymentScreenPage> consumer) {
        this.paymentScreenPage.goTo();
        consumer.accept(paymentScreenPage);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @DataProvider(name = "testScenarios")
    public Object[] testData() {
        return new Object[] {
                freeCoupon.andThen(buy).andThen(successfulPurchase),
                validCC.andThen(buy).andThen(successfulPurchase),
                discountedCoupon.andThen(validCC).andThen(buy).andThen(successfulPurchase),
                invalidCC.andThen(buy).andThen(failedPurchase),
                invalidCC.andThen(discountedCoupon).andThen(buy).andThen(failedPurchase),
                buy.andThen(failedPurchase)
        };
    }

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
        this.paymentScreenPage = new PaymentScreenPage(driver);
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
