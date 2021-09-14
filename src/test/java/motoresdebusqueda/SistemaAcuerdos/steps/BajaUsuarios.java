package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.*;
import net.thucydides.core.annotations.Steps;

public class BajaUsuarios {
    @Steps
    VisualizacionesBajas visualizacionesBajas;
    @Steps
    BotonesBajas baja;
    @Steps
    ConfiguracionBajaUsuario bajaUsuario;

    @When("hacemos clic en baja and usuarios")
    public void hacemosClicEnBajaAndUsuarios() {
        baja.botonBajas();
        baja.botonBajaUsuario();
    }

    @Then("visualizamos la seccion: {string}")
    public void VisualizamosLaSeccion(String mensajeBaja) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarios(mensajeBaja);
    }

    @And("hacemos clic en habilitar usuario")
    public void hacemosClicEnHabilitarUsuario() {
        bajaUsuario.clicHabilitarUsuario();
    }

    @Then("debemos ver un alert que diga: {string}")
    public void debemosVerUnAlertQueDiga(String mensajeUsuarioHabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarioHabilitado(mensajeUsuarioHabilitado);
    }
    @And("hacemos clic en deshabilitar usuario")
    public void hacemosClicEnDeshabilitarUsuario() {
        bajaUsuario.clicDeshabilitarUsuario();
    }

    @Then("debemos ver nuevamente un alert que diga: {string}")
    public void debemosVerNuevamenteUnAlertQueDiga(String mensajeUsuarioDeshabilitado) {
        visualizacionesBajas.visualizarMensajeBajaDeUsuarioDeshabilitado(mensajeUsuarioDeshabilitado);
        bajaUsuario.clicButtonCerrarBajaUsuario();

    }
}
