package com.demo.qa.pages.forms;

import com.demo.qa.data.GenerateRandomData;
import com.demo.qa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h5[normalize-space()='Student Registration Form']")
    WebElement formTitle;

    public String getFormTitle() {
        return formTitle.getText();
    }

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userNumber")
    WebElement userNumber;

    @FindBy(css = ".custom-control-label")
    List <WebElement> radioButtonList;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;

    @FindBy(css = ".react-datepicker__month-select")
    WebElement monthSelect;

    @FindBy(css = ".react-datepicker__year-select")
    WebElement yearSelect;

    @FindBy(css = ".react-datepicker__week")
    List  <WebElement> weekSelect;



    public PracticeFormPage pickMonth() {
        Select select = new Select(monthSelect);
        select.selectByIndex(new GenerateRandomData().generateRandomNumberInRange(1,12));
        return this;
    }

    public PracticeFormPage pickYear() {
        Select select = new Select(yearSelect);
        select.selectByValue(new GenerateRandomData().generateRandomNumberInRange(1900,2100).toString());
        return this;
    }

    public PracticeFormPage pickDay() {
            String randomDay = new GenerateRandomData().generateRandomNumberInRange(1, 30).toString();
        for (int i = 0; i < weekSelect.size(); i++) {
            WebElement row = weekSelect.get(i);

            int size = row.findElements(By.cssSelector(".react-datepicker__day")).size();
            for (int k = 0; k < size; k++) {
                System.out.println(randomDay);
                System.out.println(row.findElements(By.cssSelector(".react-datepicker__day")).get(k).getText());
                if (row.findElements(By.cssSelector(".react-datepicker__day")).get(k).getText().contains(randomDay)) {
                    System.out.println(555);
                    row.findElements(By.cssSelector(".react-datepicker__day")).get(k).click();
                }
            }
        }
        return this;
    }

    public PracticeFormPage pickDate() {
        clickOnElement(dateOfBirthInput);
        pickMonth();
        pickYear();
        return this;
    }

    public PracticeFormPage selectGender() {
        int maxRange = radioButtonList.size();
        radioButtonList.get(new GenerateRandomData().generateRandomNumberInRange(1,maxRange)).click();
        return this;
    }

    public PracticeFormPage fillOutForm() {
        fillField(new GenerateRandomData().generateFirstName(),firstName);
        fillField(new GenerateRandomData().generateLastName(),lastName);
        fillField(new GenerateRandomData().generateEmail(),userEmail);
        fillField(new GenerateRandomData().generateMobilePhone(),userNumber);
        selectGender();
        pickDate();
        return this;
    }


}
