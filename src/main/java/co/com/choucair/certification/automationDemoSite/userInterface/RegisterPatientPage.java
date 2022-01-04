package co.com.choucair.certification.automationDemoSite.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPatientPage extends PageObject {
    public static final Target INPUT_NOMBRES = Target.the("Campo para escribir los nombres del paciente").located(By.cssSelector("div.form-group > input[name='name']"));
    public static final Target INPUT_APELLIDOS = Target.the("Campo para escribir los apellidos del paciente").located(By.cssSelector("div.form-group > input[name='last_name']"));
    public static final Target INPUT_TELEFONO = Target.the("Campo para escribir el telefono del paciente").located(By.cssSelector("div.form-group > input[name='telephone']"));
    public static final Target SELECT_DOC_TYPE = Target.the("selector de tipo de documento").located(By.cssSelector("div.form-group > select[name='identification_type']"));
    public static final Target DOC_TYPE_LIST = Target.the("Lista de tipos de documento").located(By.xpath("//option[@value='Cédula de ciudadanía']"));
    public static final Target INPUT_DOC_IDENTIDAD = Target.the("Campo para escribir el documento del paciente").located(By.cssSelector("div.form-group > input[name='identification']"));
    public static final Target CHECKBOX_PREPAID_HEALTH = Target.the("Checkbox para decir si tiene o no salud prepagada").located(By.cssSelector("label > input[type='checkbox']"));
    public static final Target SAVE_BUTTON = Target.the("Botón para guardar los datos del formulario").located(By.cssSelector("a[onclick = 'submitForm()']"));
    public static final Target MESSAGE = Target.the("Mensaje de registro exitoso").located(By.cssSelector("div.panel-body > p"));
}
