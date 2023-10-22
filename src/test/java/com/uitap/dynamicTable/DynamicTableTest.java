package com.uitap.dynamicTable;

import com.uitap.BaseTest;
import com.uitap.pages.HomePage;
import com.uitap.pages.dynamicTable.DynamicTablePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicTableTest extends BaseTest {
    @BeforeMethod
    public  void prepare() {
        new HomePage(driver).redirectToDynamicTable();
    }

    @Test
    public void clickOnButtonWithDITest() {
        Assert.assertEquals(new DynamicTablePage(driver).findValueOfDynamicElement(), new DynamicTablePage(driver).findDynamicElement());
    }
}
