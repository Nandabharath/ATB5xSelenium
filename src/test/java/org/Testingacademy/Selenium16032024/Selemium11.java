package org.Testingacademy.Selenium16032024;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Selemium11 {


    @Test(groups = "QA")
    @Description("Verify the current URl, title of VWO app")
    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        // 1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        //        **Project #1 - TC ( Negaative) - Invalid username, pass - Error message**
//
//        1. Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
//        2. **Find the Email id** and enter the email as admin@admin.com
//        3. **Find the pass inputbox** and enter passwrod as admin.
//        4. Find and Click on the submit button
//        5. Verify that the error message is shown "Your email, password, IP address or location did not match"
//

        // 2. **Find the Email id** and enter the email as admin@admin.com
        //  id, className, name, css Selector, xpath
        //  LinkText and PartialText which are onlu for <a>
        // <input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi">

        WebElement emailinputbox = driver.findElement(By.id("login-username"));
        emailinputbox.sendKeys("admin");

        WebElement passwordbox =driver.findElement(By.id("login-password"));
        passwordbox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(3000);
        }
            catch(InterruptedException e){
            throw  new RuntimeException(e);
        }
        WebElement Error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msgtext= Error_msg.getText();

        Assert.assertEquals(Error_msg, "Your email, password, IP address or location did not match");
        driver.quit();

    }
}

