package co.com.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;



public class WikipediaValidateAlert implements Question<Boolean> {

    public String mensaje;
    public String key;
    public  WikipediaValidateAlert(String mensaje,String key){
        this.mensaje = mensaje;
        this.key = key;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = key.equalsIgnoreCase(mensaje);

        return result;
    }

    public static WikipediaValidateAlert alertEquals(String mensaje,String key){
        return new WikipediaValidateAlert(mensaje,key);
    }
}
