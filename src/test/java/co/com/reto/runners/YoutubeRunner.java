package co.com.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\TestYoutube.feature",
        glue = "co.com.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class YoutubeRunner {
}
