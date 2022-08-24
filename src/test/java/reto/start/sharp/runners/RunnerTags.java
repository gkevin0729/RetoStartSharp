package reto.start.sharp.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/escenary1.feature",
        tags = "@scenery",
        glue = "reto.start.sharp.stepsdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
