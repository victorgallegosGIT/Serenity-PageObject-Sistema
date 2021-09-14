package motoresdebusqueda.SistemaAcuerdos.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesAltas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltaTiposDeAcuerdo;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaTiposDeAcuerdo {
    @Steps
    VisualizacionesAltas SistemaHome;
    @Steps
    BotonesAltas cart;
    @Steps
    ConfiguracionAltaTiposDeAcuerdo tipo;
    @Steps
    VisualizacionesAltas ver;


    @When("hacemos clic en alta and tipos de acuerdo")
    public void hacemosClicEnAltaAndTiposDeAcuerdo() {
        cart.botonAlta();
        cart.botonAltaTiposDeAcuerdo();
    }

    @Then("debemos dirigirnos hacia la seccion: {string}")
    public void debemosDirigirnosHaciaLaSeccion(String mensaje) {
        ver.visualizarAltaTiposDeAcuerdo("Alta Tipos de Acuerdo");
    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String Codigo, String TipoDeAcuerdo) {
        tipo.ingresarCodigoTiposDeAcuerdo(Codigo);
        tipo.ingresarTiposDeAcuerdo(TipoDeAcuerdo);
    }

    @And("le damos guardar tipo de acuerdo")
    public void leDamosGuardarTipoDeAcuerdo() {
        tipo.botonGuardarTipoDeAcuerdo();

    }

    @Then("deberíamos visualizar un alert que diga: {string}")
    public void deberíamosVisualizarUnAlertQueDiga(String string) {
        SistemaHome.visualizarAltaTiposDeAcuerdoRegistrado("Tipo Acuerdo cargado correctamente");
    }

}
