package org.Testingacademy.Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.text.Normalizer;

public class Selenium06 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

        Proxy proxy=new Proxy();
       // proxy.setHttpProxy("host :laocal");
proxy.setHttpProxy("121.40.185.42:1080");
edgeOptions.setCapability("proxy",proxy);
        WebDriver driver =new EdgeDriver();
        driver.get("https//sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

        // NONE -> 0.5 ms
        // EAGER - 1
        // NORMAL  - 5-7 Seconds

    }
}
