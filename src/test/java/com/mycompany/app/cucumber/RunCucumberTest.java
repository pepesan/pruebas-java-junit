package com.mycompany.app.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/informes", "json:target/informes/cucumber.json"})
public class RunCucumberTest{
}