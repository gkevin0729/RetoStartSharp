package reto.start.sharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage {
    public static final Target meetingButton = Target.the("click meeting")
            .located(By.linkText("Meeting"));

    public static final Target meetingsButton = Target.the("click meetings")
            .located(By.linkText("Meetings"));

    public static final Target newMeetingButton = Target.the("click new meeting")
            .located(By.xpath("//i[@class='fa fa-plus-circle text-green']"));

    public static final Target nameMeeting = Target.the("write name meeting")
            .located(By.name("MeetingName"));

    public static final Target numberMeeting = Target.the("write number meeting")
            .located(By.name("MeetingNumber"));

    public static final Target toggleTypeMeeting = Target.the("toggle type meeting")
            .located(By.xpath("//a[@class='select2-choice']"));

    public static final Target selectTypeMeeting = Target.the("select type meeting")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-6']/child::li[4]"));

    public static final Target startCalendarButton = Target.the("click calendar button")
            .located(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));

    public static final Target selectStartDate = Target.the("Select start day the meeting")
            .located(By.xpath("(//td[@data-handler='selectDay'])[25]"));


    public static final Target selectHourStart = Target.the("Select start hour the meeting")
            .located(By.xpath("(//option[@value='11:30'])[1]"));

    public static final Target endCalendarButton = Target.the("click calendar button")
            .located(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));

    public static final Target selectEndDate = Target.the("Select end day the meeting")
            .located(By.xpath("(//td[@class=' '])[20]"));

    public static final Target selectHourEnd = Target.the("select hour end meeting")
            .located(By.xpath("(//option[@value='16:30'])[2]"));

    public static final Target locationToggle = Target.the("click toggle location")
            .located(By.xpath("(//a[@class='select2-choice select2-default'])[6]"));

    public static final Target selectLocation = Target.the("Select toggle location")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-7']/child::li[3]"));


    public static final Target unitToggle = Target.the("click toggle unit")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId']"));

    public static final Target selectUnit = Target.the("Select unit")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-8']/child::li[2]"));


    public static final Target toggleOrganizedBy = Target.the("click toggle Organized by")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId']"));
    public static final Target selectOrganizedBy = Target.the("Select Select Organized By")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-9']/child::li[7]"));

    public static final Target toggleReporter = Target.the("click toggle reporter")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId']"));

    public static final Target selectReporter = Target.the("Select Select reporter")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-10']/child::li[5]"));

    public static final Target toggleAttendeeList = Target.the("click toggle Attendee List")
            .located(By.xpath("//div[@id='s2id_autogen11']"));

    public static final Target selectAttendee = Target.the("Select Select Attender")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-12']/child::li[2]"));
    public static final Target saveButton = Target.the("save meeting")
            .located(By.xpath("(//i[@class='fa fa-check-circle text-purple'])"));
    public static final Target toggleMeetingType = Target.the("click toggle Meeting type ")
            .located(By.xpath("//div[@id='s2id_Serenity_Pro_Meeting_MeetingGrid0_QuickFilter_MeetingTypeId']"));

    public static final Target selectMeetingType = Target.the("click toggle Meeting type ")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-1']/child::li[4]"));
    public static final Target searchMeeting = Target.the(" search meeting ")
            .locatedBy("(//a[contains(text(),'{0}')])[1]");
}
