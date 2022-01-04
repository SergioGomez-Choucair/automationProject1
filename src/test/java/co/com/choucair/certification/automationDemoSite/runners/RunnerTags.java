package co.com.choucair.certification.automationDemoSite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agendar_cita_medica.feature",
        tags="@stories",
        glue = "co.com.choucair.certification.automationDemoSite.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
