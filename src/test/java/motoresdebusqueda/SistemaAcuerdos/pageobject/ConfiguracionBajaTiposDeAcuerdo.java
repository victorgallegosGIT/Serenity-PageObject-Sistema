package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionBajaTiposDeAcuerdo extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlTiposAcuerdo_GridTipoAcuerdoBaja_btnHabilitar_9")
    WebElementFacade clichabilitarTipoDeAcuerdo;

    @FindBy(id = "ContentPlaceHolder1_ControlTiposAcuerdo_GridTipoAcuerdoBaja_btnDeshabilitar_9")
    WebElementFacade clicdeshabilitarTipoDeAcuerdo;

    @FindBy(id = "ContentPlaceHolder1_ControlTiposAcuerdo_btncerrarbaja")
    WebElementFacade clicCerrarBajaTipoDeAcuerdo;

    public void ClichabilitarTipoDeAcuerdo(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clichabilitarTipoDeAcuerdo.click();
    }

    public void clicDeshabilitarTipoDeAcuerdo() {
        clicdeshabilitarTipoDeAcuerdo.click();
    }

    public void clicButtonCerrarBajaTipoDeAcuerdo() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarBajaTipoDeAcuerdo.click();
    }
}
