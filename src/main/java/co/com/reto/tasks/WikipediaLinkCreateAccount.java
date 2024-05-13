package co.com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.reto.userinterfaces.WikipediaPage.CREATE_AN_ACCOUNT;

public class WikipediaLinkCreateAccount implements Task {



    @Override
    public <T extends Actor> void performAs(T t) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CREATE_AN_ACCOUNT));
    }
    public static WikipediaLinkCreateAccount clickCreateAccount(){
        return Tasks.instrumented(WikipediaLinkCreateAccount.class);
    }
}
