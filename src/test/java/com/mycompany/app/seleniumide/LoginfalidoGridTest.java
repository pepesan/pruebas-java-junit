package com.mycompany.app.seleniumide;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
import java.util.concurrent.TimeUnit;

public class LoginfalidoGridTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginfalido() {
    // Test name: Login falido
    // Step # | name | target | value
    // 1 | open | /wp-admin/ | 
    driver.get("https://cursosdedesarrollo.com/wp-admin/");
    // 2 | type | id=user_login | admin
    driver.findElement(By.id("user_login")).sendKeys("admin");
    // 3 | type | id=user_pass | asddads
    driver.findElement(By.id("user_pass")).sendKeys("asddads");
    // 4 | click | id=wp-submit | 
    driver.findElement(By.id("wp-submit")).click();
    // 5 | assertText | id=login_error | ERROR: The username or password you entered is incorrect. Lost your password?
    assertThat(driver.findElement(By.id("login_error")).getText(), containsString("ERROR:"));
  }
}