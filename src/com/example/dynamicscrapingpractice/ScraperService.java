package com.example.dynamicscrapingpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class ScraperService {

    private static final String URL = "https://relatedwords.org/relatedto/";

    private final ChromeDriver driver;

    public ScraperService(ChromeDriver driver){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josh and Jessica\\OneDrive\\Desktop\\chromedriver.exe");
        this.driver = driver;

    }

    public void scrape(final String value){
        driver.get(URL + value);
        final WebElement words = driver.findElement(By.className("words"));
        final List<WebElement> wordList = words.findElements(By.tagName("a"));
        wordList.forEach(word -> System.out.println(word.getText()));
        driver.quit();
    }

}
