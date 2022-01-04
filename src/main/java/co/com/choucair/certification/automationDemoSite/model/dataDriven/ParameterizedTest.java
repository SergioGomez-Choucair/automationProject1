package co.com.choucair.certification.automationDemoSite.model.dataDriven;

import co.com.choucair.certification.automationDemoSite.model.PatientData;
import co.com.choucair.certification.automationDemoSite.tasks.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.Actor;
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
public class ParameterizedTest{

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

        patientData.setName(name);
        patientData.setLastName(lastName);
        patientData.setPhone(phone);
        patientDataList.add(0,patientData);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPatient.patientForm(patientDataList));
    }

}
