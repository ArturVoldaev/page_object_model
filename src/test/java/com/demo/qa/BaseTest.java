package com.demo.qa;

import com.demo.qa.pages.BasePage;
import com.test.qa.utils.MyListener;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {


 public EventFiringWebDriver driver;
 Logger logger = LoggerFactory.getLogger("rer");

 @BeforeMethod
    public void setUp() {
     driver= new EventFiringWebDriver(new FirefoxDriver());

     driver.get("https://demoqa.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

     driver.register(new MyListener());

     new BasePage(driver).hideAd();
     new BasePage(driver).hideFooter();
 }

 @AfterMethod(enabled = false)
    public void tearDown() {driver.quit();}
}
