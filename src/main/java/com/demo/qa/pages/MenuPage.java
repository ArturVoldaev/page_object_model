package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver)  {
        super(driver);
    }


    @FindBy(xpath = "(//a[.='Main Item 2'])")
    WebElement elem2;

    @FindBy(xpath = "//a[.='SUB SUB LIST »']")
    WebElement subsubList;

    @FindBy(xpath = "//a[.='Sub Sub Item 2']")
    WebElement subsubItem2;

    public MenuPage hoverToLastElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(elem2).perform();
        System.out.println("FIRST MOUSE HOVER - " + elem2.getText());

//        actions.moveToElement(subsubList).perform();
//        System.out.println("SECOND MOUSE HOVER - " + subsubList.getText());
//
//        actions.moveToElement(subsubItem2).perform();
//        System.out.println("THIRD MOUSE HOVER - " + subsubItem2.getText());


        return this;

    }
}
