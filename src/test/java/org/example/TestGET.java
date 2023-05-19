package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestGET {
    private static final Logger logger = LoggerFactory.getLogger(TestGET.class);
    @Test
    public void testGooglePage() {
        // Установить путь к драйверу Chrome, если необходимо
        // System.setProperty("webdriver.chrome.driver", "/chromedriver");

        // Загрузка драйвера Chrome с помощью WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Создать экземпляр драйвера Chrome
        WebDriver driver = new ChromeDriver();

        // Открыть страницу google.com
        driver.get("https://www.google.com");

        // Проверить заголовок страницы
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);

        // Закрыть браузер
        driver.quit();

        // Вывести произвольный текст в логах с помощью slf4j
        logger.info("This test passed well. Very good!");
    }
}
