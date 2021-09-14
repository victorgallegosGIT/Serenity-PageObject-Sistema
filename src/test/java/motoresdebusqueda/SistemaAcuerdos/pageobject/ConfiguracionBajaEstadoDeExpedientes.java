package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionBajaEstadoDeExpedientes extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlEstadosExpedientes_GridEstadosBaja_btnHabilitar_0")
    WebElementFacade clichabilitarEstado;

    @FindBy(id = "ContentPlaceHolder1_ControlEstadosExpedientes_GridEstadosBaja_btnDeshabilitar_0")
    WebElementFacade clicdeshabilitarEstado;

    @FindBy(id = "ContentPlaceHolder1_ControlEstadosExpedientes_btncerrarbaja")
    WebElementFacade clicCerrarBajaEstado;

    public void ClichabilitarEstadoDeExpedientes(){
        clichabilitarEstado.click();
    }

    public void clicDeshabilitarEstadoDeExpedientes() {
        clicdeshabilitarEstado.click();
    }

    public void clicButtonCerrarBajaEstadoDeExpedientes() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarBajaEstado.click();
    }
}
