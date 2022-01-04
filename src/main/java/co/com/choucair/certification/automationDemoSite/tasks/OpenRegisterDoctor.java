package co.com.choucair.certification.automationDemoSite.tasks;

import co.com.choucair.certification.automationDemoSite.userInterface.ListaAdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenRegisterDoctor implements Task {

    public static OpenRegisterDoctor doctorForm() {
        return Tasks.instrumented(OpenRegisterDoctor.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ListaAdministracionPage.AGREGAR_DOCTOR));
    }
}
