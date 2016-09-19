package com.example.theagiletester.discalive;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import org.junit.Test;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/com/example/theagiletester/discalive/features", format = {"pretty", "html:report"})

public class CucumberRunnerTest {
}
