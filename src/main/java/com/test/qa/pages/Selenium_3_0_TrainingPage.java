package com.test.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Selenium_3_0_TrainingPage extends BasePage {
    public Selenium_3_0_TrainingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//li[contains(@class,'price_amount')])")
    List <WebElement> prices;



    public String getPrice() {
        String newStr= "";
        for (WebElement column : prices)
        {
            newStr =  column.getText();
        }
        return newStr;
    }


    @FindBy(css = "div[class='page_heading'] h1")
    WebElement h1;

    public String h1(){
        System.out.println( h1.getText());
        return h1.getText();
    }

}
