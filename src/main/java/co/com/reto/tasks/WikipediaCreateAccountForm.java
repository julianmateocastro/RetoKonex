package co.com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.USER_INPUT;
import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.PASSWORD_INPUT;
import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.PASSWORD_INPUT_CONFIRM;
import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.MAIL_INPUT;
import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.BUTTON_CREATE_ACCOUNT;
import static co.com.reto.userinterfaces.WikipediaCreateAccountPage.CAPTCHA_INPUT_VALUE;
import static co.com.reto.utils.FakerUtils.generateRandomPassword;
import static co.com.reto.utils.FakerUtils.generateRandomEmail;
import static co.com.reto.utils.FakerUtils.generateRandomUsername;

public class WikipediaCreateAccountForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String password = generateRandomPassword();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(generateRandomUsername()).into(USER_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Enter.theValue(password).into(PASSWORD_INPUT_CONFIRM),
                Enter.theValue(generateRandomEmail()).into(MAIL_INPUT),
                Click.on(BUTTON_CREATE_ACCOUNT),
                AlertCaptureJs.captureJsValueAlert(CAPTCHA_INPUT_VALUE)
        );
    }

    public static WikipediaCreateAccountForm createAccount(){
        return Tasks.instrumented(WikipediaCreateAccountForm.class);
    }
}
