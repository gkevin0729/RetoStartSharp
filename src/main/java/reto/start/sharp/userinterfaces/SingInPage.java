package reto.start.sharp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInPage extends PageObject {


    public static final Target userName = Target.the("write user")
            .located(By.name("Username"));
    public static final Target password = Target.the("write password")
            .located(By.name("Password"));
    public static final Target singInButton = Target.the("click Sing In")
            .located(By.xpath("//button[@class='btn btn-primary my-3 w-100']"));
}
