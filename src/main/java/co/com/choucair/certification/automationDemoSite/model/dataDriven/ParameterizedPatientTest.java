package co.com.choucair.certification.automationDemoSite.model.dataDriven;

import co.com.choucair.certification.automationDemoSite.model.PatientData;
import co.com.choucair.certification.automationDemoSite.questions.AnswerRegisterPatient;
import co.com.choucair.certification.automationDemoSite.tasks.OpenRegisterPatient;
import co.com.choucair.certification.automationDemoSite.tasks.OpenUp;
import co.com.choucair.certification.automationDemoSite.tasks.RegisterPatient;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/testData/patients.csv")
public class ParameterizedPatientTest {

    List<PatientData> patientDataList;
    PatientData patientData;

    private String name;
    private String lastName;
    private String phone;

    @Before
    public void navigate(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), OpenRegisterPatient.patientForm());
    }

    @Test
    public void shouldRegisterPatientSuccessfully(){
        patientDataList = new ArrayList<>();
        patientData = new PatientData();
        String mensaje = "Datos guardados correctamente.";

        patientData.setName(name);
        patientData.setLastName(lastName);
        patientData.setPhone(phone);
        patientDataList.add(0,patientData);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPatient.patientForm(patientDataList));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegisterPatient.toThe(mensaje)));
    }

}
