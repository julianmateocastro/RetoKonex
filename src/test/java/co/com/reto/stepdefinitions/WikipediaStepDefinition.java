package co.com.reto.stepdefinitions;

import co.com.reto.questions.WikipediaValidateAlert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;


import static co.com.reto.questions.WikipediaValidateSearch.searchEquals;
import static co.com.reto.questions.WikipediaValidateTitle.titleEquals;
import static co.com.reto.tasks.WikipediaCreateAccountForm.createAccount;
import static co.com.reto.tasks.WikipediaLinkCreateAccount.clickCreateAccount;
import static co.com.reto.tasks.WikipediaSearchWord.searchWord;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;



public class WikipediaStepDefinition {

    @Given("^the user enters wikipedia page$")
    public void theUserEntersWikipediaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://es.wikipedia.org/wiki/Wikipedia:Portada"));
    }

    @Then("^the user validates the title (.*) on Wikipedia's main page$")
    public void theUserValidatesTheTitleOnWikipediaSMainPage(String title) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                titleEquals(title), Matchers.is(true)
        ));
    }

    @Given("^the user enters wikipeadia page$")
    public void theUserEntersWikipeadiaPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://es.wikipedia.org/wiki/Wikipedia:Portada"));
    }

    @When("^the user writes the word(.*)$")
    public void theUserMakesTheWord(String word) {
        OnStage.theActorInTheSpotlight().attemptsTo(searchWord(word));
    }

    @Then("^the user validate the word (.*)$")
    public void theUserValidateTheWord(String word) {
        OnStage.theActorInTheSpotlight().should(seeThat(searchEquals(word)));
    }

    @When("^the user makes click in the button Crear cuenta$")
    public void theUserMakesClickInTheButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(clickCreateAccount());

    }

    @And("^the user fills the register form$")
    public void theUserFillsTheRegisterForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(createAccount());

    }

    @Then("^The user validates that the message (.*) is presented in the captcha pop-up$")
    public void theUserValidatesThatTheMessageIsPresentedInTheCaptchaPopUp(String alert) {
        String mensaje = OnStage.theActorInTheSpotlight().recall("mensaje");
        OnStage.theActorInTheSpotlight().should(seeThat(
                WikipediaValidateAlert.alertEquals(alert,mensaje)
        ));
    }
}
