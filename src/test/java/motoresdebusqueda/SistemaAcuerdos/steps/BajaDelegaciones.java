package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesBajas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaDelegaciones;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaDelegaciones {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    BotonesBajas baja;
    @Steps
    ConfiguracionBajaDelegaciones bajaDelegaciones;

    @When("hacemos clic en baja and delegaciones")
    public void hacemosClicEnBajaAndTiposDeAcuerdo() {
        baja.botonBajas();
        baja.botonBajaDelegacion();
    }

    @Then("debemos visualizar la siguiente seccion: {string}")
    public void DebemosVisualizarLaSiguienteSeccin(String mensajeBajaDelegacion) {
        visualizacionesBajas.visualizarMensajeBajaDelegaciones(mensajeBajaDelegacion);
    }

    @And("hacemos clic en habilitar delegacion")
    public void hacemosClicEnHabilitarDelegacion() {
        bajaDelegaciones.ClichabilitarDelegacion();
    }

    @Then("debemos ver la alerta que diga: {string}")
    public void debemosVerLaAlertaQueDiga(String mensajeHabilitado) {
        visualizacionesBajas.visualizarMensajeDelegacionHabilitado(mensajeHabilitado);
    }
    @And("hacemos clic en deshabilitar delegacion")
    public void hacemosClicEnDeshabilitarDelegacion() {
        bajaDelegaciones.clicDeshabilitarDelegacion();
    }

    @Then("debemos visualizar una alerta que diga: {string}")
    public void debemosVisualizarUnaUnAlertQueDiga(String mensajeDeshabilitado) {
        visualizacionesBajas.visualizarMensajeDelegacionDeshabilitado(mensajeDeshabilitado);
        bajaDelegaciones.clicButtonCerrarBajaDelegacion();

    }
}
