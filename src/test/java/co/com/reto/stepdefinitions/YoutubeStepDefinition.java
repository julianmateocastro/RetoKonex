package co.com.reto.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static co.com.reto.questions.YoutubeValidateSong.songEqual;
import static co.com.reto.tasks.YoutubeSearchSong.searchSong;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class YoutubeStepDefinition {
    @Managed
    private WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("^the user the user enters youtube page$")
    public void theUserTheUserEntersYoutubePage() {
    OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.youtube.com/"));
    }

    @When("^the user searches the song (.*)$")
    public void theUserSearchesTheSong(String song) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                searchSong(song)
        );
    }

    @Then("^the user validates the name of the song (.*)$")
    public void theUserValidatesTheNameOfTheSong(String song)  {
        OnStage.theActorInTheSpotlight().should(seeThat(
                songEqual(song), Matchers.is(true)
        ));
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
