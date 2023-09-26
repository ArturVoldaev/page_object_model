package com.demo.qa;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetJsExecuter extends BasePage {
    JavascriptExecutor js;
    public GetJsExecuter(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    public GetJsExecuter typeNameEmailWithJSE(String userName, String userEmail) {
        if (userName != null && userEmail != null) {
            js.executeScript("document.getElementById('userName').value='" + userName + "';");
            js.executeScript("document.getElementById('userName').style.border='2px solid red';");

            js.executeScript("document.getElementById('userEmail').value='" + userEmail + "';");
            js.executeScript("document.getElementById('userEmail').style.border='2px solid red';");

            WebElement userN = driver.findElement(By.id("userName"));
            System.out.println(userN.getText() + " By text");
            System.out.println(userN.getAttribute("value") + " By value");
        }
        return this;
    }

    public GetJsExecuter clickSubmintButton() {
        js.executeScript("document.getElementById('submit').style.background='red';");        js.executeScript("document.getElementById('submit').style.background='red';");
        js.executeScript("document.getElementById('submit').click()");
        return this;
    }

    public GetJsExecuter checkboxWithJSE() {
        js.executeScript("document.getElementById('gender-radio-1').checked=false");
        js.executeScript("document.getElementById('gender-radio-2').checked=true");
        System.out.println(driver.findElement(By.id("gender-radio-2")).isSelected());
        System.out.println(driver.findElement(By.id("gender-radio-1")).isSelected());
        return this;

    }
}


