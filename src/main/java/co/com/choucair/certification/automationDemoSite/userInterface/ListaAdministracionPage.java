package co.com.choucair.certification.automationDemoSite.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListaAdministracionPage extends PageObject {
    public static final Target AGREGAR_DOCTOR = Target.the("botón para abrir el formulario de registro de un doctor").located(By.xpath("//a[@href='addDoctor']"));
    public static final Target AGREGAR_PACIENTE = Target.the("botón para abrir el formulario de registro de pacientes").located(By.cssSelector("a[href='addPatient']"));
}
