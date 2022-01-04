package co.com.choucair.certification.automationDemoSite.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterDoctorPage extends PageObject {
    public static final Target INPUT_NOMBRES = Target.the("Campo para escribir los nombres del doctor").located(By.id("name"));
    public static final Target INPUT_APELLIDOS = Target.the("Campo para escribir los apellidos del doctor").located(By.id("last_name"));
    public static final Target INPUT_TELEFONO = Target.the("Campo para escribir el telefono del doctor").located(By.id("telephone"));
    public static final Target SELECT_DOC_TYPE = Target.the("selector de tipo de documento").located(By.id("identification_type"));
    public static final Target DOC_TYPE_LIST = Target.the("Lista de tipos de documento").located(By.xpath("//option[@value='Cédula de ciudadanía']"));
    public static final Target INPUT_DOC_IDENTIDAD = Target.the("Campo para escribir el documento del doctor").located(By.id("identification"));
    public static final Target SAVE_BUTTON = Target.the("Botón para guardar los datos del formulario").located(By.xpath("//a[@onclick='submitForm()']"));
    public static final Target MESSAGE = Target.the("Mensaje de registro exitoso").located(By.xpath("//div[@class='panel-body']"));

}
