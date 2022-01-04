package co.com.choucair.certification.automationDemoSite.stepDefinitions;

import co.com.choucair.certification.automationDemoSite.model.dataDriven.ParameterizedTest;
import co.com.choucair.certification.automationDemoSite.questions.AnswerRegisterDoctor;
import co.com.choucair.certification.automationDemoSite.questions.AnswerRegisterPatient;
import co.com.choucair.certification.automationDemoSite.tasks.OpenRegisterPatient;
import co.com.choucair.certification.automationDemoSite.tasks.OpenUp;
import co.com.choucair.certification.automationDemoSite.tasks.RegisterDoctor;
import co.com.choucair.certification.automationDemoSite.tasks.RegisterPatient;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationPatientStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^que Carlos necesita registrar un nuevo paciente$")
    public void que_carlos_necesita_registrar_un_nuevo_paciente() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), OpenRegisterPatient.patientForm());
    }

    @When("^el realiza el registro del paciente en el aplicativo de Administración de Hospitales$")
    public void el_realiza_el_registro_del_paciente_en_el_aplicativo_de_administracin_de_hospitales(List<ParameterizedTest> patientData){
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPatient.patientForm(patientData));
    }

    @Then("^el verifica que se muestre en pantalla el mensaje (.*)$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_datos_guardados_correctamente(String mensaje){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegisterPatient.toThe(mensaje)));
    }

}
