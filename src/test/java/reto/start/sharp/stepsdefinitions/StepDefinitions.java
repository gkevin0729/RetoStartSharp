package reto.start.sharp.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.start.sharp.models.InfoPerson;
import reto.start.sharp.questions.ReviewNameTheMeeting;
import reto.start.sharp.tasks.CreateMeeting;
import reto.start.sharp.tasks.CreateNewOrganization;
import reto.start.sharp.tasks.OpenUp;
import reto.start.sharp.tasks.SingIn;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Kevin").wasAbleTo(OpenUp.thePage());
    }

    @Given("^login page with my credentials$")
    public void loginPageWithMyCredentials(List<InfoPerson> info)  {
        theActorInTheSpotlight().attemptsTo(SingIn.inThePage(info));


    }

    @When("^create a new organization business unit on the page$")
    public void createANewOrganizationBusinessUnitOnThePage(List<InfoPerson> nameOrganization) {
        theActorInTheSpotlight().attemptsTo(CreateNewOrganization.businessUnit(nameOrganization));

    }
    @And("^Create a new meeting$")
    public void createANewMeeting(List<InfoPerson> nameMeeting) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.inStartSharp(nameMeeting));

    }

    @Then("^verify that the meeting was created with the name of (.*)$")
    public void verifyThatTheMeetingWasCreatedWithTheNameOfChoucairTesting(String nameMeet)  {
        theActorInTheSpotlight().should(seeThat(ReviewNameTheMeeting.inThePageOfMeeting(nameMeet)));



    }
}
