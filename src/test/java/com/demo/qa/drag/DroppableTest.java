package com.demo.qa.drag;

import com.demo.qa.BaseTest;
import com.demo.qa.pages.HomePage;
import com.demo.qa.pages.SidePanelPage;
import com.demo.qa.pages.droppable.DroppablePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTest extends BaseTest {
    @BeforeMethod
    public void prepare() {
        new HomePage(driver).getInteraction();
        new SidePanelPage(driver).selectDroppable();
    }

    @Test
    public void dragAndDropBaseTest () {
        new DroppablePage(driver).actionDropMe();
    }

    @Test
    public void dragAndDropByTest () {
        new DroppablePage(driver).actionDragDropBy();
    }

    @Test
    public void dragAndDropByIndexTest () {
        new DroppablePage(driver).actionDragDropByIndex(350, 50);
    }
}
