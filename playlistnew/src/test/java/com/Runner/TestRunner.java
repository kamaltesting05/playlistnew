package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin={"pretty"}, format = {"html:target/reports"})

public class TestRunner {

}
