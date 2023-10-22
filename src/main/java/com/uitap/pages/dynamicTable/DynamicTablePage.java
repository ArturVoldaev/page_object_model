package com.uitap.pages.dynamicTable;

import com.uitap.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicTablePage extends BasePage {
    public DynamicTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".bg-warning")
    WebElement purpose;

    public String findValueOfDynamicElement() {
        return purpose.getText().substring(12);
    }

    @FindBy(xpath = "(//div[@role='rowgroup'])[2]//div")
    List <WebElement> rows;


    public String findDynamicElement() {
        String result = null;

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> innerElem = rows.get(i).findElements(By.tagName("span"));
            for (int j = 0; j < innerElem.size(); j++) {
                if (innerElem.get(j).getText().trim().equals(findValueOfDynamicElement())) {
                    result = innerElem.get(j).getText().toString();
                }
            }
        }
        return result;
    }
}
