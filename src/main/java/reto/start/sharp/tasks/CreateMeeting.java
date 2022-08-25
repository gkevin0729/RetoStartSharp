package reto.start.sharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto.start.sharp.models.InfoPerson;


import java.util.List;

import static java.lang.Thread.*;
import static reto.start.sharp.userinterfaces.MeetingPage.*;


public class CreateMeeting implements Task {
    private List<InfoPerson> meeting;

    public CreateMeeting(List<InfoPerson> meeting) {
        this.meeting = meeting;
    }


    public static CreateMeeting inStartSharp(List<InfoPerson> meeting) {
        return Tasks.instrumented(CreateMeeting.class, meeting);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(meetingButton),
                Click.on(meetingsButton),
                Click.on(newMeetingButton));
        actor.attemptsTo(Enter.theValue(meeting.get(0).getMeeting()).into(nameMeeting));
        actor.attemptsTo(Enter.theValue(meeting.get(0).getNumber()).into(numberMeeting),
                Click.on(toggleTypeMeeting),
                Click.on(selectTypeMeeting),
                Click.on(startCalendarButton),
                Click.on(selectStartDate),
                Click.on(selectHourStart),
                Click.on(endCalendarButton),
                Click.on(selectEndDate));
        actor.attemptsTo(Click.on(selectHourEnd),
                Click.on(locationToggle),
                Click.on(selectLocation),
                Click.on(unitToggle),
                Click.on(selectUnit),
                Click.on(toggleOrganizedBy),
                Click.on(selectOrganizedBy),
                Click.on(toggleReporter),
                Click.on(selectReporter),
                Click.on(toggleAttendeeList),
                Click.on(selectAttendee),
                Click.on(saveButton));
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
