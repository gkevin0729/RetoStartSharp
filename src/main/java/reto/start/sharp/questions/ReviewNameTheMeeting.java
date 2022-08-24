package reto.start.sharp.questions;

import static java.lang.String.valueOf;
import static reto.start.sharp.userinterfaces.NavigatePage.*;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import org.asciidoctor.extension.Reader;

public class ReviewNameTheMeeting implements Question<Void> {
    private String nameMeeting;

    public ReviewNameTheMeeting(String nameMeetingg) {
        this.nameMeeting = nameMeetingg;
    }

    public static ReviewNameTheMeeting inThePageOfMeeting(String nameMeeting) {
        return new ReviewNameTheMeeting(nameMeeting);
    }

    @Override
    public Void answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(toggleMeetingType),
                Click.on(selectMeetingType));
        actor.attemptsTo(Click.on(searchMeeting));
            System.out.println("Meeting created successfully");


        return null;
    }

}


