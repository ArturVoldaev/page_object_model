package com.demo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.demo.qa.pages.elements.BrokenLinksImagesPage;
import com.demo.qa.pages.elements.TextBoxPage;
import com.demo.qa.pages.forms.PracticeFormPage;

public class SidePanelPage extends BasePage {
    public SidePanelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = " //span[.='Text Box']")
    WebElement textBox;

    public TextBoxPage selectedTextBox(){
        clickOnElementWithJS(textBox, 0, 150);
        return new TextBoxPage(driver);
    }


    @FindBy(xpath = "//div[normalize-space()='Forms']//span")
    WebElement practice;

    @FindBy(xpath = "//span[normalize-space()='Practice Form']")
    WebElement forms;
    public PracticeFormPage selectPracticeForm() {
        clickOnElementWithJS(practice, 0, 400);
        clickOnElement(forms);
        return new PracticeFormPage(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='Broken Links - Images']")
    WebElement brokenLinksImages;


    @FindBy(xpath = "//h5[normalize-space()='Elements']")
    WebElement elements;


    public BrokenLinksImagesPage selectedBIP() {
        clickOnElementWithJS(brokenLinksImages, 0, 400);
        return new BrokenLinksImagesPage(driver);
    }
}
