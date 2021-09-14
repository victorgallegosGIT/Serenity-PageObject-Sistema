package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;

public class ConfiguracionBajaPerfil extends PageObject {

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_GridPerfilesBaja_btnHabilitar_7")
    WebElementFacade clichabilitar;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_GridPerfilesBaja_btnDeshabilitar_7")
    WebElementFacade clicdeshabilitar;

    @FindBy(id = "ContentPlaceHolder1_ControlPerfiles_btnCerrarBaja")
    WebElementFacade clicCerrarBajaPerfil;

    public void clicHabilitarBajaPerfil() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clichabilitar.click();
    }

    public void clicDeshabilitarBajaPerfil() {
        clicdeshabilitar.click();
    }

    public void clicButtonCerrarBajaPerfil() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,550)", "");
        clicCerrarBajaPerfil.click();
    }
}
