package com.example.hello_selenium_junit;

// Generated by Selenium IDE
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ImdbRemoteTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(System.getProperty("browser", "firefox"));
        driver = new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"), capabilities);

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void imdbwandavision() {
        driver.get("https://www.imdb.com/");
        driver.manage().window().setSize(new Dimension(771, 695));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("wandavision");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        WebElement we = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.linkText("WandaVision")));
        we.click();
        //driver.findElement(By.linkText("WandaVision")).click();
        we = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.linkText("TRIVIA")));
        we.click();
        //driver.findElement(By.linkText("TRIVIA")).click();

    }
}