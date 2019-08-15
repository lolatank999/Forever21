/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author User
 */
public class Forever21projTest {

    private WebDriver driver;
    private String baseUrl;

    public Forever21projTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
         System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();
    baseUrl = "https://www.forever21.com/us/shop";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testForever21projTest(){
         driver.get("https://www.forever21.com/us/shop");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search Products'])[1]/following::span[1]")).click();
    driver.findElement(By.id("sign in")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='See details'])[2]/following::span[1]")).click();
    try {
      assertEquals("SIGN IN", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='See details'])[2]/following::span[1]")).getText());
    } catch (Error e) {
     // verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("txt_signin_email")).click();
    driver.findElement(By.id("txt_signin_email")).clear();
    driver.findElement(By.id("txt_signin_email")).sendKeys(FileUtil.getLogin().getUsername());
    driver.findElement(By.id("txt_signin_pwd")).click();
    driver.findElement(By.id("txt_signin_pwd")).clear();
    driver.findElement(By.id("txt_signin_pwd")).sendKeys(FileUtil.getLogin().getPassword());
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RESEND'])[2]/following::button[1]")).click();
    }
}
