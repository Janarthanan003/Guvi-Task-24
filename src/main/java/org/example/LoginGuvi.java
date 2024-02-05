package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGuvi {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/register");
        // driver.findElement(By.id("email")).sendKeys("abc@mail.com");
       // driver.findElement(By.id("password")).sendKeys("123123");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@mail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123123");

    }
}
