package co.com.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaCreateAccountPage {

    public static final Target USER_INPUT = Target.the("The user input").located(By.id("wpName2"));
    public static final Target PASSWORD_INPUT = Target.the("The password input").located(By.id("wpPassword2"));
    public static final Target PASSWORD_INPUT_CONFIRM = Target.the("The confirm password input").located(By.id("wpRetype"));
    public static final Target MAIL_INPUT = Target.the("The mail input").located(By.id("wpEmail"));
    public static final Target BUTTON_CREATE_ACCOUNT = Target.the("The button create account").located(By.id("wpCreateaccount"));
    public static final String CAPTCHA_INPUT_VALUE= "mw-input-captchaWord";

}
