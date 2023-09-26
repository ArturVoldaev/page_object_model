package com.demo.qa.pages.elements;

import com.test.qa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class BrokenLinksImagesPage extends BasePage {
    public BrokenLinksImagesPage (WebDriver driver) {
        super(driver);
    }


    @FindBy(tagName = "a")
    List<WebElement> links;
    public BrokenLinksImagesPage checkAllLinks() {
        String url = "";
        Iterator<WebElement> iterator = links.iterator();
        while(iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }
                return this;
    }

    public BrokenLinksImagesPage checkBrokenLinks() {
        for (int i=0; i< links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLinks(url);
        }
        return this;
    }

    private BrokenLinksImagesPage verifyLinks(String link) {
        try {
            URL url = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(link + " - " + httpURLConnection.getResponseCode() + " IS BROKEN");
            }
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(link + " IS TOTALLY BROKEN");
        }
        return this;
    }
}
