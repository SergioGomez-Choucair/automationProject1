package co.com.choucair.certification.automationDemoSite.questions;

import co.com.choucair.certification.automationDemoSite.model.DoctorData;
import co.com.choucair.certification.automationDemoSite.userInterface.RegisterDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerRegisterDoctor implements Question<Boolean> {
    private List<DoctorData> doctorDataList;

    public AnswerRegisterDoctor(List<DoctorData> doctorDataList) {
        this.doctorDataList = doctorDataList;
    }

    public static AnswerRegisterDoctor toThe(List<DoctorData> doctorDataList){
        return new AnswerRegisterDoctor(doctorDataList);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String messageObtained = Text.of(RegisterDoctorPage.MESSAGE).viewedBy(actor).asString();
        if(doctorDataList.get(0).getMensaje().equals(messageObtained)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
