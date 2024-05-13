package co.com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class WikipediaPage {

    public static final Target WIKIPEDIA_INPUT_SEARCH = Target.the("The wikipedia input search").located(By.id("searchInput"));
    public static final Target WIKIPEDIA_BUTTON_SEARCH = Target.the("The wikipedia button search").located(By.xpath("//*[@id=\"searchform\"]/div/button"));
    public static final Target WIKIPEDIA_TITLE = Target.the("The wikipedia title").located(By.id("Bienvenidos_a_Wikipedia,"));
    public static final Target WIKIPEDIA_SEARCH_WORD = Target.the("The word to search for on Wikipedia").located(By.id("Análisis_CEEM"));
    public static final Target CREATE_AN_ACCOUNT = Target.the("The link to create an account").located(By.id("pt-createaccount-2"));

}
