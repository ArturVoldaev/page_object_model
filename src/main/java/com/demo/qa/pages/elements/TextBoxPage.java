package com.demo.qa.pages.elements;

import com.demo.qa.data.Names;
import com.test.qa.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submit;


    public TextBoxPage keyBoadrEvent() {
        Actions actions  = new Actions(driver);

        fillField(Names.TEXT_BOX_USER, userName);
        fillField(Names.TEXT_BOX_EMAIL, userEmail);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 400)");
        fillField(Names.TEXT_BOX_ADDRESS, currentAddress);

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.TAB).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        clickOnElement(submit);

        return this;

    }

    public String getFieldCurrentAddress( ) {
        return currentAddress.getAttribute("value");
    }
    public String getFieldPermanentAddress( ) {
        return permanentAddress.getAttribute("value");
    }

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement outputCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement outputPermanentAddress;

    public String outputCurrentAddress( ) {
        return outputCurrentAddress.getText();
    }
    public String outputPermanentAddress( ) {
        return permanentAddress.getAttribute("placeholder") + " :" + outputPermanentAddress.getText();
    }
}
