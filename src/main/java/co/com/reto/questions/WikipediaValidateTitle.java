package co.com.reto.questions;

import co.com.
        reto.userinterfaces.WikipediaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WikipediaValidateTitle implements Question {

    String title;
    public WikipediaValidateTitle (String title){
        this.title = title;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String cadena = WikipediaPage.WIKIPEDIA_TITLE.resolveFor(actor).getText().toUpperCase();
        cadena = cadena.replace(",", "");
        return cadena.contains(title.toUpperCase());
    }
    public static WikipediaValidateTitle titleEquals(String title){
        return new WikipediaValidateTitle(title);}
}
