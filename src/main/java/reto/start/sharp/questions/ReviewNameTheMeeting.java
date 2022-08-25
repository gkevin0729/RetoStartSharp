package reto.start.sharp.questions;


import static reto.start.sharp.userinterfaces.NavigatePage.*;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ReviewNameTheMeeting implements Question<Boolean> {
    private String nameMeeting;

    public ReviewNameTheMeeting(String nameMeetingg) {
        this.nameMeeting = nameMeetingg;
    }

    public static ReviewNameTheMeeting inThePageOfMeeting(String nameMeeting) {
        return new ReviewNameTheMeeting(nameMeeting);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        Boolean result;
        actor.attemptsTo(Click.on(toggleMeetingType),
                Click.on(selectMeetingType));
        result=Text.of(searchMeeting.of(nameMeeting)).viewedBy(actor).asString().equals(nameMeeting);

        return result;


    }

}


