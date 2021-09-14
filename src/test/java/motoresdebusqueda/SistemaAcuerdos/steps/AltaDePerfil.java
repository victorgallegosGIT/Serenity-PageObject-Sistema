package motoresdebusqueda.SistemaAcuerdos.steps;

import motoresdebusqueda.SistemaAcuerdos.pageobject.ConfiguracionAltaPerfil;
import motoresdebusqueda.SistemaAcuerdos.pageobject.VisualizacionesAltas;
import motoresdebusqueda.SistemaAcuerdos.pageobject.SistemaDeAcuerdosLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import motoresdebusqueda.SistemaAcuerdos.pageobject.BotonesAltas;
import net.thucydides.core.annotations.Steps;

public class AltaDePerfil {
    @Steps
    SistemaDeAcuerdosLogin paginaPrincipal;
   @Steps
   VisualizacionesAltas visualizacionesAltas;
   @Steps
   BotonesAltas cart;
   @Steps
   ConfiguracionAltaPerfil AltaPerfil;

    @Given("nos encontramos en la pagina principal de Sistema de Acuerdos")
    public void NosEncontramosEnlaPaginaPrincipalDeSistemaDeAcuerdos() {
        paginaPrincipal.setDefaultBaseUrl("http://10.1.1.132:9791/");
        paginaPrincipal.open();
    }

    @When("nos logueamos rellenando el modal con los siguientes datos: {string} {string}")
    public void ingresaUsuarioYPassword(String usuario, String password) {
        paginaPrincipal.ingresarUsuario(usuario);
        paginaPrincipal.ingresarPassword(password);
        paginaPrincipal.hacerClickEnElBotonLogIn();
    }

    @Then("deberíamos visualizar el mensaje de bienvenida: {string}")
      public void deberiaVisualizarElMensajeDeBienvenida(String mensaje) {
        visualizacionesAltas.visualizarMensajeDeBienvenida(mensaje);
      }

    @When("hacemos clic en alta and perfil")
    public void hacemosClicEnAltaAndPerfil() {
        cart.botonAlta();
        cart.botonAltaPerfil();
    }

    @Then("deberíamos dirigirnos hacia la seccion: {string}")
    public void deberiamosDirigirnosHaciaLaSeccion(String mensajealta) {
        visualizacionesAltas.visualizarMensajeAltaDePerfiles(mensajealta);
    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String CodigoPerfil, String NombreDePerfil, String Delegacion) {
        AltaPerfil.ingresarCodigoPerfil(CodigoPerfil);
        AltaPerfil.IngresarNombreDePerfil(NombreDePerfil);
        AltaPerfil.ingresarDelegaciones(Delegacion);
        AltaPerfil.checkBoxAdministrador();
        AltaPerfil.checkboxPermisosCrear();
        AltaPerfil.checkboxPermisosCosultar();
        AltaPerfil.checkboxPermisosModificar();
    }

    @And("le damos guadar perfil")
    public void le_damos_guadar_perfil() {
        AltaPerfil.buttonGuardarPerfil();
    }


}