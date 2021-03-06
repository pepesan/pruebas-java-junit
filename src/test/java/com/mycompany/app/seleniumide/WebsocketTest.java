package com.mycompany.app.seleniumide;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class WebsocketTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pepesan\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void pruebaWebSocket() {

    driver.get("http://161.22.43.216/");
    driver.findElement(By.id("link-about")).click();
  }
}
