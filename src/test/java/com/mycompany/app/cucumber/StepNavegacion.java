package com.mycompany.app.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepNavegacion {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    String urlBase = "https://www.selenium.dev/";

    @Given("^Estando en la página principal$")
    public void estandoEnLaPáginaPrincipal() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(urlBase);
    }

    @When("^introduzco un dato$")
    public void introduzcoUnDato() {
        driver.findElement(By.cssSelector(".nav-item:nth-child(1)")).click();
        driver.findElement(By.linkText("About")).click();
    }

    @Then("^debería ver el dato en la caja de búsqueda$")
    public void deberíaVerElDatoEnLaCajaDeBúsqueda() {
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("About Selenium"));
        driver.close();
    }
}
