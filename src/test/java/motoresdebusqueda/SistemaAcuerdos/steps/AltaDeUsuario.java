package motoresdebusqueda.SistemaAcuerdos.steps;

import motoresdebusqueda.SistemaAcuerdos.pageobject.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;

public class AltaDeUsuario {
   @Steps
   VisualizacionesAltas SistemaHome;
   @Steps
   BotonesAltas cart;
   @Steps
   ConfiguracionAltaUsuario RcAltaUsuarios;
   @Steps
   VisualizacionesAltas ver;

    @When("hacemos clic en alta and usuario")
    public void hacemosClicEnAltaAndUsuario() {
        cart.botonAlta();
        cart.botonAltaUsuario();
    }

    @Then("deberíamos dirigirnos ha la seccion: {string}")
    public void deberiamosDirigirnosHaLaSeccion(String AltaDeUsuario ) {
        ver.visualizarAlerAltaDeUsuario("Alta de Usuarios");

    }

    @And("rellenamos el formulario con los siguientes datos: {string} {string} {string} {string} {string} {string} {string} {string}")
    public void rellenamosElFormularioConLosSiguientesDatos(String NameUser, String Name, String Apellido, String DNI, String Telefono, String Direccion, String Perfil, String Contraseña) {
        RcAltaUsuarios.ingresarNombreUsuario(NameUser);
        RcAltaUsuarios.ingresarNombre(Name);
        RcAltaUsuarios.ingresarApellido(Apellido);
        RcAltaUsuarios.ingresarDni(DNI);
        RcAltaUsuarios.ingresarTelefono(Telefono);
        RcAltaUsuarios.ingresarDireccion(Direccion);
        RcAltaUsuarios.ingresarPerfil(Perfil);
        RcAltaUsuarios.ingresarContrasenia(Contraseña);
    }

    @And("le damos guardar usuario")
    public void le_damos_guardar_usuario() {
        RcAltaUsuarios.botonGuardarUsuario();
    }

    @Then("deberíamos visualizar un alert exitoso que diga: {string}")
    public void deberíamos_visualizar_un_alert_exitoso_que_diga(String string) {
        SistemaHome.visualizarAlerExitosoUsuario("Usuario guardado correctamente");
    }

}
