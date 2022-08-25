package reto.start.sharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrganizationPage {

    public static final Target organizationButton = Target.the("click organization")
            .located(By.linkText("Organization"));

    public static final Target businessUnitButton = Target.the("click business unit")
            .located(By.linkText("Business Units"));

    public static final Target newBusinessUnitButton = Target.the("click new business unit")
            .located(By.xpath("//i[@class='fa fa-plus-circle text-green']"));

    public static final Target nameBusinessUnit = Target.the("write business unit")
            .located(By.name("Name"));

    public static final Target selectParentUnit = Target.the("toggle parent business unit")
            .located(By.xpath("//span[@class='select2-chosen']"));

    public static final Target selectParentAdmin = Target.the("select parent business unit")
            .located(By.xpath("//div[@id='select2-drop']//ul[@id='select2-results-1']/child::li[4]"));

    public static final Target saveBusinessUnit = Target.the("save business unit")
            .located(By.xpath("(//i[@class='fa fa-check-circle text-purple'])"));


}
