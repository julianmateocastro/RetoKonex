package co.com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.reto.userinterfaces.YoutubePage.SEARCH_BUTTON;
import static co.com.reto.userinterfaces.YoutubePage.SEARCH_INPUT;
import static co.com.reto.userinterfaces.YoutubePage.FIRST_SEARCH;

public class YoutubeSearchSong implements Task {

    private String song;
    public YoutubeSearchSong(String song){
        this.song = song;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(song).into(SEARCH_INPUT),
                Click.on(SEARCH_BUTTON),
                Click.on(FIRST_SEARCH));
    }

    public static YoutubeSearchSong searchSong(String song){
        return Tasks.instrumented(YoutubeSearchSong.class, song);
    }
}
