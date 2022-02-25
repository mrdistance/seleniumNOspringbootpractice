package com.example.dynamicscrapingpractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPracticeApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josh and Jessica\\OneDrive\\Desktop\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
        ScraperService ss = new ScraperService(driver);
        ss.scrape("fish");
    }

}
