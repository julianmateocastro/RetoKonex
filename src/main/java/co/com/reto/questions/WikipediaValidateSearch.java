package co.com.reto.questions;

import co.com.reto.userinterfaces.WikipediaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;

public class WikipediaValidateSearch implements Question {

    String search;
    public WikipediaValidateSearch (String search){
        this.search = search;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(WikipediaPage.WIKIPEDIA_SEARCH_WORD));
        String cadena = WikipediaPage.WIKIPEDIA_SEARCH_WORD.resolveFor(actor).getText().toUpperCase();
        return cadena.contains(search.toUpperCase());
    }
    public static WikipediaValidateSearch searchEquals(String search){
        return new WikipediaValidateSearch(search);}
}
