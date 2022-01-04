package co.com.choucair.certification.automationDemoSite.tasks;

import co.com.choucair.certification.automationDemoSite.model.DoctorData;
import co.com.choucair.certification.automationDemoSite.userInterface.RegisterDoctorPage;
import co.com.choucair.certification.automationDemoSite.utils.GenerateRandomIdNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegisterDoctor implements Task {

    private final List<DoctorData> doctorDataList;

    public RegisterDoctor(List<DoctorData> doctorDataList) {
        this.doctorDataList = doctorDataList;
    }

    public static RegisterDoctor registerForm(List<DoctorData> doctorDataList){
        return Tasks.instrumented(RegisterDoctor.class, doctorDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        GenerateRandomIdNumber generateRandomIdNumber = new GenerateRandomIdNumber();
        actor.attemptsTo(Enter.theValue(doctorDataList.get(0).getNombres()).into(RegisterDoctorPage.INPUT_NOMBRES),
                        Enter.theValue(doctorDataList.get(0).getApellidos()).into(RegisterDoctorPage.INPUT_APELLIDOS),
                        Enter.theValue(doctorDataList.get(0).getTelefono()).into(RegisterDoctorPage.INPUT_TELEFONO),
                        Click.on(RegisterDoctorPage.SELECT_DOC_TYPE),
                        Click.on(RegisterDoctorPage.DOC_TYPE_LIST),
                        Enter.theValue(generateRandomIdNumber.getRandomId().toString()).into(RegisterDoctorPage.INPUT_DOC_IDENTIDAD),
                        Click.on(RegisterDoctorPage.SAVE_BUTTON)
        );
    }
}
