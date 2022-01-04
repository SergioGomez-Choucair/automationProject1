package co.com.choucair.certification.automationDemoSite.stepDefinitions;

import co.com.choucair.certification.automationDemoSite.model.DoctorData;
import co.com.choucair.certification.automationDemoSite.questions.AnswerRegisterDoctor;
import co.com.choucair.certification.automationDemoSite.tasks.OpenRegisterDoctor;
import co.com.choucair.certification.automationDemoSite.tasks.OpenUp;
import co.com.choucair.certification.automationDemoSite.tasks.RegisterDoctor;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationDoctorStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^que Carlos necesita registrar un nuevo doctor$")
    public void que_carlos_necesita_registrar_un_nuevo_doctor(){
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), OpenRegisterDoctor.doctorForm());
    }

    @When("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
    public void el_realiza_el_registro_del_mismo_en_el_aplicativo_de_administracin_de_hospitales(List<DoctorData> doctorData){
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterDoctor.registerForm(doctorData));
    }

    @Then("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_datos_guardados_correctamente(List<DoctorData> doctorDataList) throws Throwable {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegisterDoctor.toThe(doctorDataList)));
    }


}
