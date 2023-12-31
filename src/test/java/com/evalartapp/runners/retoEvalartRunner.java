package com.evalartapp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\features\\retoEvalart.feature",
        glue="com.evalartapp.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class retoEvalartRunner {
}
