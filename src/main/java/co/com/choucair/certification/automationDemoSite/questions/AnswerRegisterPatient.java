package co.com.choucair.certification.automationDemoSite.questions;

import co.com.choucair.certification.automationDemoSite.userInterface.RegisterPatientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerRegisterPatient implements Question<Boolean> {
    private String mensaje;

    public AnswerRegisterPatient(String mensaje) {
        this.mensaje = mensaje;
    }

    public static AnswerRegisterPatient toThe(String mensaje){
        return new AnswerRegisterPatient(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String messageObtained = Text.of(RegisterPatientPage.MESSAGE).viewedBy(actor).asString();
        if(mensaje.equals(messageObtained)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
