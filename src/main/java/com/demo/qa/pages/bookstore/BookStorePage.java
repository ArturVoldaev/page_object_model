package com.demo.qa.pages.bookstore;

import com.demo.qa.data.Names;
import com.demo.qa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BookStorePage extends BasePage {
    public BookStorePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "searchBox")
    WebElement searchBox;

    public  BookStorePage searchBook (String bookName) {
        fillField(bookName, searchBox);
        return this;
    }


    @FindBy(css = ".rt-noData")
    WebElement noRowsText;

    public String getNowRowTex() {
        return noRowsText.getText();
    }

    public String getEmptyRowNane() {
        return "a";
    }

    @FindBy(css = ".books-wrapper")
    WebElement tableContainer;

    public int searchResultJsBook(String containText) {
        return getSizeElementsOnPage(tableContainer, By.xpath("//span[contains(.,'"+ containText +"')]"));
    }

    public List<WebElement> getListBook (String searchNameOfBook) {
        return tableContainer.findElements(By.xpath("//a[contains(.,'"+ searchNameOfBook +"')]"));
    }

    @FindBy(xpath = "//a[normalize-space()='Speaking JavaScript']")
    WebElement bb;

    @FindBy(css = "#addNewRecordButton")
    WebElement backButton;

    public List getLinksFromWebElement(String searchNameOfBook) {
        List <WebElement> seekName = getListBook(searchNameOfBook);
        List <String> links = new ArrayList<>();
        for (int i = 0; i < seekName.size(); i++) {
            links.add(seekName.get(i).getAttribute("href"));
        }
        return links;
    }

    public List getBookNameWebElement(String searchNameOfBook) {
        List <WebElement> seekName = getListBook(searchNameOfBook);
        List <String> bookName = new ArrayList<>();
        for (int i = 0; i < seekName.size(); i++) {
            bookName.add(seekName.get(i).getText());
        }
        return bookName;
    }

    @FindBy(xpath = "//div[@id='title-wrapper']//label[@id='userName-value']")
    WebElement bookTitle;

    public WebElement bookTitle() {
        return bookTitle;
    }

    public void clickOnElementAssertTitle() {
        ArrayList <String> el = (ArrayList<String>) getLinksFromWebElement(Names.BOOK_NAME_JS);
        ArrayList <String> bookName = (ArrayList<String>) getBookNameWebElement(Names.BOOK_NAME_JS);

        for (int i = 0; i < el.size() ; i++) {
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get(el.get(i));
            Assert.assertEquals(bookTitle().getText(), bookName.get(i));
        }
    }

}
