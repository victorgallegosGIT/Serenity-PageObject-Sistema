package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ConfiguracionBajaUsuario extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnHabilitar_0")
    WebElementFacade clichabilitarUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_GridBajaUsuarios_btnDeshabilitar_0")
    WebElementFacade clicdeshabilitarUsuario;

    @FindBy(id = "ContentPlaceHolder1_ControlUsuarios_btnCancelarBaja")
    WebElementFacade clicCerrarBajaUsuario;

    public void clicHabilitarUsuario(){
        clichabilitarUsuario.click();
    }

    public void clicDeshabilitarUsuario() {
        clicdeshabilitarUsuario.click();
    }

    public void clicButtonCerrarBajaUsuario() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarBajaUsuario.click();
    }
}
