package reto.start.sharp.questions;


import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import static reto.start.sharp.userinterfaces.MeetingPage.*;

public class ReviewNameTheMeeting implements Question<Boolean> {
    private final String nameMeeting;

    public ReviewNameTheMeeting(String nameMeetingg) {
        this.nameMeeting = nameMeetingg;
    }

    public static ReviewNameTheMeeting inThePageOfMeeting(String nameMeeting) {
        return new ReviewNameTheMeeting(nameMeeting);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        actor.attemptsTo(Click.on(toggleMeetingType),
                Click.on(selectMeetingType));
        result=Text.of(searchMeeting.of(nameMeeting)).viewedBy(actor).asString().equals(nameMeeting);

        return result;


    }

}


