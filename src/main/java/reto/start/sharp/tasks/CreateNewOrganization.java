package reto.start.sharp.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.start.sharp.models.InfoPerson;

import java.util.List;
import static reto.start.sharp.userinterfaces.OrganizationPage.*;

public class CreateNewOrganization implements Task {
    private List<InfoPerson> choucair;

    public CreateNewOrganization(List<InfoPerson> choucair) {
        this.choucair = choucair;
    }


    public static CreateNewOrganization businessUnit(List<InfoPerson>choucair) {
        return Tasks.instrumented(CreateNewOrganization.class, choucair);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(organizationButton),
                Click.on(businessUnitButton),
                Click.on(newBusinessUnitButton));
        actor.attemptsTo(Enter.theValue(choucair.get(0).getOrganization()).into(nameBusinessUnit),
                Click.on(selectParentUnit));
        actor.attemptsTo(Click.on(selectParentAdmin),
                Click.on(saveBusinessUnit));


    }
}
