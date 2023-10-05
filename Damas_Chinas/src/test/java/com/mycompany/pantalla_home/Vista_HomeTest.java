/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pantalla_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucho
 */
public class Vista_HomeTest {
    
    public Vista_HomeTest() {
    }
    
    @Test
    //Inicio de home con label de reglas y su boton de cerrar sin visibilizar.
    public void test_home_inicial(){ 
        
        Vista_Home vista_home = new Vista_Home();
        Assertions.assertFalse(vista_home.getReglasVisible());
        Assertions.assertFalse(vista_home.getBCReglasVisible());
    }
    
    @Test
    /* Testeo que deja de estar activa la vista */
    public void test_jugar(){
        Vista_Home vista_home = new Vista_Home();
        vista_home.getBotonJugar().doClick();
        Assertions.assertFalse(vista_home.isActive());
        
    }
    
    @Test
    /* Testeo que se muestran las reglas y se cierran */
    public void test_reglas(){
        Vista_Home vista_home = new Vista_Home();
        vista_home.getBotonReglas().doClick();
        assertTrue(vista_home.getLayoutReglas().isVisible());
        vista_home.getBotonCerrarReglas().doClick();
        assertFalse(vista_home.getLayoutReglas().isVisible());
        
    }
    
    @Test
    /* Testeo que se muestran las stats */
    public void test_stats(){
        Vista_Home vista_home = new Vista_Home();
        vista_home.getBotonStats().doClick();
        assertTrue(vista_home.getMuestraStats());
    }
    
    @Test
    /* Testeo que se muestra la pantalla de configuracion */
    public void test_config(){
        Vista_Home vista_home = new Vista_Home();
        vista_home.getBotonConfig().doClick();
        assertTrue(vista_home.getMuestraConfig());
    }
    
    @Test
    public void test_exit(){
        //Vista_Home vista_home = new Vista_Home();
        //vista_home.getBotonExit().doClick();
        //assertTrue(vista_home.getAux());
    }
        
        

}
    
    

    

