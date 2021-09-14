package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesAltas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltaDelegaciones;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaDelegaciones {
    @Steps
    VisualizacionesAltas SistemaHome;
    @Steps
    BotonesAltas cart;
    @Steps
    VisualizacionesAltas ver;
    @Steps
    ConfiguracionAltaDelegaciones dele;

    @When("hacemos clic en alta and delegaciones")
    public void hacemosClicEnAltaAndDelegaciones() {
        cart.botonAlta();
        cart.botonAltaDelegacion();
    }

    @Then("deberíamos dirigirnos hasta la seccion: {string}")
    public void DeberiamosDirigirnosHastaLaSeccion(String mensaje) {
        ver.visualizarAltaDeDelegaciones("Alta de Delegaciones");
    }

    @And("rellenamos el form con los siguientes datos: {string} {string}")
    public void rellenamosElFormConLosSiguientesDatos(String CodigoDelegacion, String NombreDelegacion) {
        dele.ingresarCodigoDelegacion(CodigoDelegacion);
        dele.ingresarNombreDelegacion(NombreDelegacion);
    }

    @And("le damos guardar delegacion")
    public void leDamosGuardarDelegacion() {
        dele.botonGuardarDelegacion();

    }

    @Then("deberíamos visualizar un alerta que diga: {string}")
    public void deberíamosVisualizarUnAlertaQueDiga(String string) {
        SistemaHome.visualizarAlertDelegacionCreada("Delegacion cargada correctamente");
    }
}
