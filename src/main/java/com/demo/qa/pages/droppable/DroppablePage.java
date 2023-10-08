package com.demo.qa.pages.droppable;

import com.demo.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {
    public DroppablePage(WebDriver driver)  {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement dragEl;

    @FindBy(id = "droppable")
    WebElement dropEl;

    public DroppablePage actionDropMe() {
        Actions action = new Actions(driver);
        action.dragAndDrop(dragEl, dropEl).perform();
        String dropText = dropEl.getText();
        if (dropText.equals("Dropped!")) System.out.println("PASSED");
        return this;
    }

    public DroppablePage actionDragDropBy() {
        Actions action = new Actions(driver);

        int xOffSetDrag = dragEl.getLocation().getX();
        int yOffSetDrag = dragEl.getLocation().getY();

        System.out.println(xOffSetDrag + "x" + yOffSetDrag);

        int xOffSetDrop = dropEl.getLocation().getX();
        int yOffSetDrop = dropEl.getLocation().getY();

        System.out.println(xOffSetDrop + "x" + yOffSetDrop);

        action.dragAndDropBy(dragEl, xOffSetDrop -xOffSetDrag + 30, yOffSetDrop-yOffSetDrag + 60).perform();
        String dropText = dropEl.getText();
        if (dropText.equals("Dropped!")) System.out.println("PASSED");

        return this;
    }

    public DroppablePage actionDragDropByIndex( int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(dragEl, x, y).perform();
        return this;
    }
}
