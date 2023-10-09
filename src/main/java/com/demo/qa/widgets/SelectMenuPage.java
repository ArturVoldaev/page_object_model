package com.demo.qa.widgets;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SelectMenuPage extends BasePage {
    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;
    public SelectMenuPage oldStyleSelect(String color) {
        Select select = new Select(oldSelectMenu);
        select.selectByVisibleText(color);
        List <WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        System.out.println(select.getFirstSelectedOption());
        return this;
    }

    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[3]")
    WebElement multiSelectMenu;

    @FindBy(xpath = "//html")
    WebElement empty;
    public SelectMenuPage multiStyleSelect(String color) {
        clickOnElementWithJS(multiSelectMenu, 0, 200);
        WebElement element = driver.findElement(By.xpath(String.format("//div[text()='%s']", color))); // int -> %d
        clickOnElement(element);
        clickOnElement(empty);
        return this;
    }

    @FindBy(css = ".css-xb97g8")
    WebElement deselectColor;

    public SelectMenuPage deselect() {
        clickOnElement(deselectColor);
        pause(5000);
        return this;
    }


    @FindBy(id = "react-select-4-input")
    WebElement forMultiSelectMenu;
    public SelectMenuPage multiSelectMore(String[] colors) {
        for (int i = 0; i <colors.length ; i++) {
            if (colors[i] != null) {
                forMultiSelectMenu.sendKeys(colors[i]);
                forMultiSelectMenu.sendKeys(Keys.ENTER);
            }
        }
        return this;
    }

    @FindBy(xpath = "((//div[@class=' css-1wy0on6'])[3]//div)[1]")
    WebElement deselectAllBtn;
    public SelectMenuPage deselectAll() {
        clickOnElementWithJS(deselectAllBtn, 0, 300);
        pause(3000);
        return this;
    }

    @FindBy(id = "cars")
    WebElement cars;
    public SelectMenuPage standartMutiSelect() {
        Select multi = new Select(cars);
        if (multi.isMultiple()) {
            multi.selectByIndex(0);
            multi.selectByIndex(1);
            multi.selectByIndex(2);
            multi.selectByIndex(3);
        }

        List <WebElement> selectedElem = multi.getAllSelectedOptions();
        for (WebElement el: selectedElem
             ) {
            System.out.println(el.getText() + " IS A SELECTED");
        }
        return this;
    }


    @FindBy(id = "withOptGroup")
    WebElement selectWithGroup;

    @FindBy(css = " .css-26l3qy-menu")
    WebElement div;

    @FindBy(css = " .css-1uccc91-singleValue")
    WebElement groupSelect;

    public SelectMenuPage selectGroupValue() {
        selectWithGroup.click();
        ArrayList <WebElement> elements = new ArrayList<>(div.findElements(By.tagName("div")));

        driver.findElement(By.xpath("//div[.='Group 2, option 1']")).click();
//        for (int i = 0; i < elements.size(); i++) {
//            if (i == indexOfElem) {
//                elements.get(i).click();
//            }
//        }
        return this;
    }

    public String selectGroupTakeValue() {
        return groupSelect.getText();
    }
}
