package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.pages.PageObject;

public class BotonesBajas extends PageObject {

    public void botonBajas() {
        findBy("#ContentPlaceHolder1_btnBajas").click();
    }

    public void botonBajaPerfil() {
        findBy("#ContentPlaceHolder1_btnPerfilesBaja").click();
    }

    public void botonBajaUsuario() {
        findBy("#ContentPlaceHolder1_btnUsuariosBaja").click();
    }

    public void botonBajaTiposDeAcuerdo() {
        findBy("#ContentPlaceHolder1_btnTipoAcuerdoBaja").click();
    }

    public void botonBajaDelegacion() {
        findBy("#ContentPlaceHolder1_btnDelegacionesBaja").click();
    }
    public void botonBajaEstadoDeExpediente() {
        findBy("#ContentPlaceHolder1_btnEstadoExpedienteBaja").click();
    }
}
