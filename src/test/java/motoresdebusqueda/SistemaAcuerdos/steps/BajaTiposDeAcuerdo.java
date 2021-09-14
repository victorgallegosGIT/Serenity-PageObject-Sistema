package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesBajas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaUsuario;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesBajas;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class BajaTiposDeAcuerdo {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    BotonesBajas baja;
    @Steps
    ConfiguracionBajaTiposDeAcuerdo bajaTipoDeAcuerdo;

    @When("hacemos clic en baja and tipos de acuerdo")
    public void hacemosClicEnBajaAndTiposDeAcuerdo() {
        baja.botonBajas();
        baja.botonBajaTiposDeAcuerdo();
    }

    @Then("debemos visualizar la seccion: {string}")
    public void DebemosVisualizamosLaSeccion(String mensajeBajaTipodeacuerdo) {
        visualizacionesBajas.visualizarMensajeBajaDeTiposDeacuerdo(mensajeBajaTipodeacuerdo);
    }

    @And("hacemos clic en habilitar tipo de acuerdo")
    public void hacemosClicEnHabilitarTiposDeAcuerdo() {
        bajaTipoDeAcuerdo.ClichabilitarTipoDeAcuerdo();
    }

    @Then("debemos ver una alerta que diga: {string}")
    public void debemosVerUnaAlertaQueDiga(String mensajeTipodeacuerdoHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeTipoDeAcuerdoHabilitado(mensajeTipodeacuerdoHabilitado);
    }
    @And("hacemos clic en deshabilitar tipo de acuerdo")
    public void hacemosClicEnDeshabilitarTiposDeacuerdos() {
        bajaTipoDeAcuerdo.clicDeshabilitarTipoDeAcuerdo();
    }

    @Then("debemos visualizar nuevamente una alerta que diga: {string}")
    public void debemosVisualizarNuevamenteUnAlertQueDiga(String mensajeTipodeacuerdoDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeTipoDeAcuerdoDeshabilitado(mensajeTipodeacuerdoDeshabilitado);
        bajaTipoDeAcuerdo.clicButtonCerrarBajaTipoDeAcuerdo();

    }

}
