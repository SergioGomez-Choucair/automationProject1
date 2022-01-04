package co.com.choucair.certification.automationDemoSite.tasks;

import co.com.choucair.certification.automationDemoSite.userInterface.ListaAdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OpenRegisterPatient implements Task {

    public static OpenRegisterPatient patientForm() { return Tasks.instrumented(OpenRegisterPatient.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(ListaAdministracionPage.AGREGAR_PACIENTE));
    }
}
