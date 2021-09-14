package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesBajas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaDelegaciones;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionBajaEstadoDeExpedientes;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesBajas;
import net.thucydides.core.annotations.Steps;

public class BajaEstadoDeExpedientes {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    BotonesBajas baja;
    @Steps
    ConfiguracionBajaEstadoDeExpedientes bajaEstado;

    @When("hacemos clic en baja and estado de expedientes")
    public void hacemosClicEnBajaAndEstadoDeExpedientes() {
        baja.botonBajas();
        baja.botonBajaEstadoDeExpediente();
    }

    @Then("debemos visualizar a continuacion la seccion: {string}")
    public void DebemosVisualizarAContinuacionSeccion(String mensajeBajaEstado) {
        visualizacionesBajas.visualizarMensajeBajaEstadoDeExpedientes(mensajeBajaEstado);
    }

    @And("hacemos clic en habilitar estado de expedientes")
    public void hacemosClicEnHabilitarEstadoDeExpedientes() {
        bajaEstado.ClichabilitarEstadoDeExpedientes();
    }

    @Then("debemos ver la siguiente alerta que diga: {string}")
    public void debemosVerLaSiguienteAlertaQueDiga(String mensajeEstadoHabilitado) {
        visualizacionesBajas.visualizarMensajeEstadoDeExpedientesHabilitado(mensajeEstadoHabilitado);
    }
    @And("hacemos clic en deshabilitar estado de expedientes")
    public void hacemosClicEnDeshabilitarEstadoDeExpedientes() {
        bajaEstado.clicDeshabilitarEstadoDeExpedientes();
    }

    @Then("debemos visualizar la siguiente alerta que diga: {string}")
    public void debemosVisualizarLaSiguienteAlertQueDiga(String mensajeEstadoDeshabilitado) {
        visualizacionesBajas.visualizarMensajeEstadoDeExpedientesDeshabilitado(mensajeEstadoDeshabilitado);
        bajaEstado.clicButtonCerrarBajaEstadoDeExpedientes();

    }
}
