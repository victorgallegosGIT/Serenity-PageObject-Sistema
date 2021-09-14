package motoresdebusqueda.SistemaAcuerdos.pageobject;

import net.serenitybdd.core.pages.PageObject;

public class BotonesAltas extends PageObject {

    public void botonAlta() {
        findBy("#ContentPlaceHolder1_btnAltas").click();
    }

    public void botonAltaPerfil() {
        findBy("#ContentPlaceHolder1_btnPerfilesAlta").click();
    }

    public void botonAltaUsuario() {
        findBy("#ContentPlaceHolder1_btnUsuariosAlta").click();
    }

    public void botonAltaTiposDeAcuerdo() {
        findBy("#ContentPlaceHolder1_btnTipoAcuerdoAlta").click();
    }

    public void botonAltaDelegacion() {
        findBy("#ContentPlaceHolder1_btnDelegacionesAlta").click();
    }
    public void botonAltaEstadoDeExpedinte() {
        findBy("#ContentPlaceHolder1_btnEstadoExpedienteAlta").click();
    }
}