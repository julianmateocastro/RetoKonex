package co.com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertCaptureJs implements Task {

    private String id;

    public AlertCaptureJs(String id){
        this.id=id;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement captchaInput = driver.findElement(By.id(id));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String mensajeValidacion = (String) js.executeScript("return arguments[0].validationMessage;",captchaInput);
        OnStage.theActorInTheSpotlight().remember("mensaje",mensajeValidacion);
    }
    public static AlertCaptureJs captureJsValueAlert(String id){
        return Tasks.instrumented(AlertCaptureJs.class, id);
    }
}
