package ru.rockstarhamster.selenium.waitings;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestTest {
   private static final String BUTTON_URL = "https://www.aviasales.ru/?params=MOW1";
    private static final String BUTTON_WAY = "/html/body/div[1]/div/div/div[2]/div[3]/div/button";
    private static final String PREDICTION_HEDER = "s__dnZ1H8wj_GPkN8QLaRiN";

   private static WebDriver webDriver;
    private static WebDriver driver;
    static HomePage homePage;

    @BeforeAll //запуск Хромдрайвера
    @DisplayName("ChromeDriver Start")
    public static void init() {
        WebDriverManager.chromedriver()
                .setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            homePage = new HomePage(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void open_google() {
        System.setProperty("webdriver.chrome.driver", "/home/alex/IdeaProjects/selenium-watings/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("some id")));
        driver.get("https://google.com");
    }
}
