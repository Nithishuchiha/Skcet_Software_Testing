package com.nithish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        try {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            options.addArguments(
                    "user-data-dir=C:\\Users\\Nithish Kumar\\AppData\\Local\\Google\\Chrome\\User Data");
            options.addArguments("profile-directory=Profile 1");
            WebDriver driver = new ChromeDriver(options);
            driver.get("http://172.16.64.5:2280/cportal/ip/user_login.php?url=http://172.16.58.100/");
            System.out.println("Starting....");
            Thread.sleep(3000);
            // WebElement frames = driver.findElement(By.xpath("/html/frameset"));
            // Thread.sleep(3000);
            driver.switchTo().frame(0);
            Thread.sleep(3000);
            driver.findElement(By.id("usrname")).sendKeys("22it120");
            driver.findElement(By.id("newpasswd")).sendKeys("nit51480");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            Thread.sleep(3000);
            executor.executeScript("document.getElementById('terms').click()");
            ;

            // driver.findElement(By.id("terms")).click();
            driver.findElement(By.xpath("/html/body/div/div[1]/form/div[5]/table[2]/tbody/tr/td")).click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
