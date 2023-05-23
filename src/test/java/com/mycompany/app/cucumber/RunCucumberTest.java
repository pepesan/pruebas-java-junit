package com.mycompany.app.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/informes", "json:target/informes/cucumber.json"})
public class RunCucumberTest{
}