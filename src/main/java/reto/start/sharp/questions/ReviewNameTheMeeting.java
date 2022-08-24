package reto.start.sharp.questions;

import static java.lang.String.valueOf;
import static reto.start.sharp.userinterfaces.NavigatePage.*;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;

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
        actor.attemptsTo(Click.on(toggleMeetingType),
                Click.on(selectMeetingType));
        actor.attemptsTo(Click.on(searchMeeting));
        System.out.println("Meeting created successfully");

        return null;


    }

}


