package com.udemy.java.test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.udemy.java.assignment2.PriceTable;
import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class PriceTableTest extends BaseTest {

    @Test
    public void minPriceTest() {
        PriceTable p = new PriceTable(driver);
        p.selectMinPriceRow();
        final String status = p.getStatus();
        Assert.assertEquals("PASS", status);
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

}
