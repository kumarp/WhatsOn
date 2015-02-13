package org.example.app.cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, features = { "classpath:features" }, glue = { "org.example.app.cucumber.stepdefinitions" })
public class MovieScenariosRunnerTest {

}
