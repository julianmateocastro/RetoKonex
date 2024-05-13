package co.com.reto.questions;

import co.com.reto.userinterfaces.YoutubePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class YoutubeValidateSong implements Question {

    String song;
    public YoutubeValidateSong (String song){
        this.song = song;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String cadena = YoutubePage.TITLE_SONG.resolveFor(actor).getTextValue().toUpperCase();
        return cadena.contains(song.toUpperCase());
    }
    public static YoutubeValidateSong songEqual(String song){
        return new YoutubeValidateSong(song);}
}
