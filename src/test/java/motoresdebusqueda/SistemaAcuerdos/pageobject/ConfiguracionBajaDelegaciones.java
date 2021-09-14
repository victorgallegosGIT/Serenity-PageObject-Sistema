package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionBajaDelegaciones extends PageObject {
    @FindBy(css = "#ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnHabilitar_0")
    WebElementFacade clichabilitarDelegacion;

    @FindBy(id = "ContentPlaceHolder1_ControlDelegaciones_GridDelegacionesBaja_btnDeshabilitar_0")
    WebElementFacade clicdeshabilitarDelegacion;

    @FindBy(id = "ContentPlaceHolder1_ControlDelegaciones_btnCerrarBaja")
    WebElementFacade clicCerrarDelegacion;

    public void ClichabilitarDelegacion(){

        clichabilitarDelegacion.click();
    }

    public void clicDeshabilitarDelegacion() {
        clicdeshabilitarDelegacion.click();
    }

    public void clicButtonCerrarBajaDelegacion() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarDelegacion.click();
    }
}
