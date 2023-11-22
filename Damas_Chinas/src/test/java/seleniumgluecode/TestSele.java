package seleniumgluecode;
import com.mycompany.pantalla_home.Vista_Config;
import com.mycompany.pantalla_home.Vista_Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;


public class TestSele {


    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester()  {
        Vista_Home vista_home = new Vista_Home();
        Assertions.assertFalse(vista_home.getReglasVisible());
        Assertions.assertFalse(vista_home.getBCReglasVisible());
    }

    @When("^Hace click sobre el boton The little tester comics$")
    public void hace_click_sobre_el_boton_The_little_tester_comics(){

    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() {

    }



}
