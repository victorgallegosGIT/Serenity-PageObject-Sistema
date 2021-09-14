package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.*;
import net.thucydides.core.annotations.Steps;

public class BajaPerfil {
    @Steps
    SistemaDeAcuerdosLogin paginaPrincipal;
    @Steps
    VisualizacionesAltas visualizacionesAltas;
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    BotonesBajas baja;
    @Steps
    ConfiguracionBajaPerfil bajaPerfil;

    @When("hacemos clic en baja and perfiles")
    public void hacemosClicEnBajaAndPerfil() {
        baja.botonBajas();
        baja.botonBajaPerfil();
    }

    @Then("observamos la seccion: {string}")
    public void observamosLaSeccion(String mensajeBaja) {
        visualizacionesBajas.visualizarMensajeBajaDePerfiles(mensajeBaja);
    }

    @And("hacemos clic en habilitar")
    public void hacemosClicEnHabilitar() {
        bajaPerfil.clicHabilitarBajaPerfil();
    }

    @Then("debemos ver un alerta que diga: {string}")
    public void debemosVerUnAlertaQueDiga(String mensajeHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDePerfilesHabilitado(mensajeHabilitado);
    }
    @And("hacemos clic en deshabilitar")
    public void hacemosClicEnDeshabilitar() {
        bajaPerfil.clicDeshabilitarBajaPerfil();
    }

    @Then("debemos ver nuevamente un alerta que diga: {string}")
    public void debemosVerNuevamenteUnAlertaQueDiga(String mensajeDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDePerfilesDeshabilitado(mensajeDeshabilitado);
        bajaPerfil.clicButtonCerrarBajaPerfil();

    }

}
