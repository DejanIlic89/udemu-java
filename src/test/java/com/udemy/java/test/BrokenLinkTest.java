package com.udemy.java.test;

import com.udemy.java.supplier.DriverFactory;
import com.udemy.java.util.LinkUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BrokenLinkTest extends BaseTest {

    //parallel stream
    @Test
    public void linkTest() {
        this.driver.get("https://www.google.com");

        System.out.println("Before :: " + LocalDateTime.now());

        final List<String> list = this.driver.findElements(By.xpath("//*[@href]"))
                .parallelStream()
                .map(e -> e.getAttribute("href"))
                .filter(src -> LinkUtil.getResponseCode(src) != 200)
                .collect(Collectors.toList());

        System.out.println("After :: " + LocalDateTime.now());

    /**
     * Find broken links using attributes src or href
     */

//    @Test
//    public void linkTest() {
//        this.driver.get("https://the-internet.herokuapp.com/broken_images");
//        this.driver.findElements(By.xpath("//*[@src]"))
//                .stream()
//                .map(e -> e.getAttribute("src"))
//                .forEach(src -> System.out.println(LinkUtil.getResponseCode(src) + " :: " + src));
//    }

    //this one not giving us enough information about broken links
//    @Test
//    public void linkTest() {
//        this.driver.get("https://the-internet.herokuapp.com/broken_images");
//        final boolean result = this.driver.findElements(By.xpath("//*[@src]"))
//                .stream()
//                .map(e -> e.getAttribute("src"))
//                .map(src -> LinkUtil.getResponseCode(src))
//                .anyMatch(rc -> rc != 200);
//
//        Assert.assertFalse(result);

//    @Test
//    public void linkTest() {
//        this.driver.get("https://the-internet.herokuapp.com/broken_images");
//        final List<String> list = this.driver.findElements(By.xpath("//*[@src]"))
//                .stream()
//                .map(e -> e.getAttribute("src"))
//                .filter(src -> LinkUtil.getResponseCode(src) != 200)
//                .collect(Collectors.toList());
//
//        Assert.assertEquals(list.size(), 0, list.toString());
    }

}
