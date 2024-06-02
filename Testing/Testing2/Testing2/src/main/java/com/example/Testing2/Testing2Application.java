package com.example.Testing2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Testing2Application {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement inputField = driver.findElement(By.name("q"));
		inputField.sendKeys("selenium");
		inputField.submit();
		List<WebElement> elements = driver.findElements(By.cssSelector("div.g a"));
		for (WebElement element : elements)
		{
			String link = element.getAttribute("href");
			System.out.println(link);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
