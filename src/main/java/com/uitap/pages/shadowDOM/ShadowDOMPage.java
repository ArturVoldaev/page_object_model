package com.uitap.pages.shadowDOM;

import com.uitap.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public class ShadowDOMPage extends BasePage {
    public ShadowDOMPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShadowElement(By by) {
        return driver.findElement(By.xpath("//div[@class='container']//guid-generator")).getShadowRoot().findElement(by);
    }

    public String writeDateInClipboard() {
        WebElement generateButton = getShadowElement(By.id("buttonGenerate"));
        WebElement copyButton = getShadowElement(By.id("buttonCopy"));
        WebElement inputValue = getShadowElement(By.id("editField"));
        clickOnElement(generateButton);
        String text = inputValue.getAttribute("value");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(text);
        clipboard.setContents(selection, null);
        clickOnElement(copyButton);
       return text;
    }

    public String readClipBoardValue() throws IOException, UnsupportedFlavorException {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        boolean hasText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        String text = null;
        if (hasText) {
            text = (String) contents.getTransferData(DataFlavor.stringFlavor);
        }
        return text;
    }
}
