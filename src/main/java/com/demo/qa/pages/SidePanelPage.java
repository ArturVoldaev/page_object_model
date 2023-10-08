package com.demo.qa.pages;

import com.demo.qa.allerts.BrowserWindowsPage;
import com.demo.qa.allerts.FramePage;
import com.demo.qa.allerts.NestedFramePage;
import com.demo.qa.pages.bookstore.BookStoreLoginPage;
import com.demo.qa.pages.bookstore.BookStorePage;
import com.demo.qa.pages.droppable.DroppablePage;
import com.demo.qa.pages.elements.BrokenLinksImagesPage;
import com.demo.qa.pages.elements.ButtonsPage;
import com.demo.qa.pages.elements.TextBoxPage;
import com.demo.qa.pages.forms.PracticeFormPage;
import com.demo.qa.widgets.SelectMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//span[normalize-space()='Book Store']")
    WebElement bookStore;
    public BookStorePage selectBookStore() {
        clickOnElementWithJS(bookStore, 0, 1000);
        return new BookStorePage(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement bookStoreLogin;

    public BookStoreLoginPage selectBookStoreLogin() {
        clickOnElementWithJS(bookStoreLogin, 0, 600);
        return new BookStoreLoginPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public BrowserWindowsPage selectBrowserWindows() {
        clickOnElementWithJS(  browserWindows,0,400);
        return new BrowserWindowsPage(driver);
    }


    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;
    public FramePage selectFrame() {
        clickOnElementWithJS(frames, 0, 400);
        return new FramePage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;
    public NestedFramePage selectNestedFrames() {

        clickOnElementWithJS(nestedFrames, 0, 400);
        return new NestedFramePage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public ButtonsPage selectButtons() {
        clickOnElementWithJS(buttons, 0, 200);
        return new ButtonsPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage selectSelectMenu() {
        clickOnElementWithJS(selectMenu, 0, 500);
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        clickOnElementWithJS(droppable, 0, 300);
        return new DroppablePage(driver);
    }
}
