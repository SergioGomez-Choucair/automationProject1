package co.com.choucair.certification.automationDemoSite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.choucair.certification.automationDemoSite.userInterface.AdministracionHospital;

public class OpenUp implements Task {

    private AdministracionHospital automationDemoSitePage;

    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoSitePage));
    }
}
