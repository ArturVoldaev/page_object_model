package com.test.qa.pages;

import com.test.qa.data.Names;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li[id='menu-item-6898'] a")
    WebElement cheatSheetTab;

    public CheatSheetPage getCheatSheet() {
        clickOnElement(cheatSheetTab);
        return new CheatSheetPage(driver);
    }

    @FindBy(css = "#s")
    WebElement searchInput;

    public SearchResultPage search() {
        fillField(Names.SELENIUM_3_0, searchInput);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        return new SearchResultPage(driver);
    }

    @FindBy(xpath = "//h3/a")
    WebElement needPage;

    public Selenium_3_0_TrainingPage getPage() {
        fillField(Names.SELENIUM_3_0, searchInput);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
        clickOnElement(needPage);
        scrollToWithJS(0, 3000);
        return new Selenium_3_0_TrainingPage(driver);
    }
}
