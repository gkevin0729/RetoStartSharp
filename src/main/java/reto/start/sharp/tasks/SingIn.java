package reto.start.sharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.Task;
import reto.start.sharp.models.InfoPerson;
import java.util.List;
import static reto.start.sharp.userinterfaces.SingInPage.*;

public class SingIn implements Task {
    private List<InfoPerson> info;

    public SingIn(List<InfoPerson> info) {
        this.info = info;
    }

    public static SingIn inThePage(List<InfoPerson> info) {
        return Tasks.instrumented(SingIn.class, info);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(Keys.DELETE).into(userName),
                Enter.keyValues(Keys.DELETE).into(password));
        actor.attemptsTo(Enter.theValue(info.get(0).getUserName()).into(userName),
                Enter.theValue(info.get(0).getPassword()).into(password));
        actor.attemptsTo(Click.on(singInButton));



    }


}

