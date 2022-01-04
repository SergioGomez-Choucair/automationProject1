package co.com.choucair.certification.automationDemoSite.tasks;

import co.com.choucair.certification.automationDemoSite.model.dataDriven.ParameterizedTest;
import co.com.choucair.certification.automationDemoSite.userInterface.RegisterDoctorPage;
import co.com.choucair.certification.automationDemoSite.userInterface.RegisterPatientPage;
import co.com.choucair.certification.automationDemoSite.utils.GenerateRandomIdNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegisterPatient implements Task {

    private final List<ParameterizedTest> patientData;

    public RegisterPatient(List<ParameterizedTest> patientData) {
        this.patientData = patientData;
    }

    public static RegisterPatient patientForm(List<ParameterizedTest> patientData){
        return Tasks.instrumented(RegisterPatient.class,patientData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GenerateRandomIdNumber generateRandomIdNumber = new GenerateRandomIdNumber();
        actor.attemptsTo(Enter.theValue(patientData.get(0).getName()).into(RegisterPatientPage.INPUT_NOMBRES),
                Enter.theValue(patientData.get(0).getLastName()).into(RegisterPatientPage.INPUT_APELLIDOS),
                Enter.theValue(patientData.get(0).getPhone()).into(RegisterPatientPage.INPUT_TELEFONO),
                Click.on(RegisterPatientPage.SELECT_DOC_TYPE),
                Click.on(RegisterPatientPage.DOC_TYPE_LIST),
                Enter.theValue(generateRandomIdNumber.getRandomId().toString()).into(RegisterPatientPage.INPUT_DOC_IDENTIDAD),
                Click.on(RegisterPatientPage.CHECKBOX_PREPAID_HEALTH),
                Click.on(RegisterPatientPage.SAVE_BUTTON));
    }
}
