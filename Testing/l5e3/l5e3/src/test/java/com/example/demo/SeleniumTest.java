package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeleniumTest {
    @LocalServerPort
    private Integer port;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("localhost:8080" + port + "/animal");
        WebElement animalText = driver.findElement(By.id("animalText"));
        WebElement adjective = driver.findElement(By.id("adjective"));

        for (int i = 0; i < 5; i++)
        {
            animalText.sendKeys("donkey");
            adjective.sendKeys("stupid");
            adjective.submit();
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
