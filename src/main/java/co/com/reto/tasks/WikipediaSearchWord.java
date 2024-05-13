package co.com.reto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.reto.userinterfaces.WikipediaPage.WIKIPEDIA_BUTTON_SEARCH;
import static co.com.reto.userinterfaces.WikipediaPage.WIKIPEDIA_INPUT_SEARCH;


public class WikipediaSearchWord implements Task {
    private String word;
    public WikipediaSearchWord(String word){
        this.word = word;
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(word).into(WIKIPEDIA_INPUT_SEARCH),
                Click.on(WIKIPEDIA_BUTTON_SEARCH));
    }
    public static WikipediaSearchWord searchWord(String word){
        return Tasks.instrumented(WikipediaSearchWord.class, word);
    }
}
