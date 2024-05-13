package co.com.reto.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YoutubePage {



    public static final Target SEARCH_INPUT = Target.the("Search Input").located(By.name("search_query"));
    public static final Target SEARCH_BUTTON = Target.the("Search Button").located(By.id("search-icon-legacy"));
    public static final Target FIRST_SEARCH = Target.the("First result of the search").located((By.xpath("(//a[@id='video-title'])[1]")));
    public static final Target TITLE_SONG = Target.the("The title of the video").located((By.xpath("//*[@id=\"title\"]/h1")));

}
