/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pantalla_home;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucho
 */
public class Vista_SeleccionModoTest {
    
    public Vista_SeleccionModoTest() {
    }
    
    
    @Test
    /* Test inicial */
    public void test_inicial(){
        Vista_SeleccionModo vista_modo = new Vista_SeleccionModo();
        vista_modo.setVisible(true); //Esto es lo que hace apretar jugar desde la pantalla anterior
        assertTrue(vista_modo.isVisible());
        assertTrue(vista_modo.getBotonIndividual().isVisible());
        assertTrue(vista_modo.getBotonMultijugador().isVisible());
        assertTrue(vista_modo.getBotonBack().isVisible());
    }
    
    /* Boton indiv */
    @Test
    public void test_boton_individual(){
        Vista_SeleccionModo vista_modo = new Vista_SeleccionModo();
        vista_modo.setVisible(true);
        vista_modo.getBotonIndividual().doClick();
        assertFalse(vista_modo.isVisible()); 
       // Si se apreta el boton se desactiva  la pantalla completa
    }
    
        /* Boton mult */
    @Test
    public void test_boton_multijugador(){
        Vista_SeleccionModo vista_modo = new Vista_SeleccionModo();
        vista_modo.setVisible(true);
        vista_modo.getBotonMultijugador().doClick();
        assertFalse(vista_modo.isVisible()); 
       // Si se apreta el boton se desactiva  la pantalla completa
    }
    /* Boton Back 
<<<<<<< HEAD:src/test/java/com/mycompany/pantalla_home/Vista_SeleccionModoTest.java
    
=======
    @Test
>>>>>>> 4d63b9aa1b55f4dc44a997e7cf10aa2bfc2a90b5:Damas_Chinas/src/test/java/com/mycompany/pantalla_home/Vista_SeleccionModoTest.java
    public void test_boton_back(){
        Vista_SeleccionModo vista_modo = new Vista_SeleccionModo();
        vista_modo.setVisible(true);
        vista_modo.getBotonBack().doClick();
        assertFalse(vista_modo.isActive());
    }
    */
    @Test
    public void test_boton_config(){
        //Vista_SeleccionModo vista_modo = new Vista_SeleccionModo();
       // vista_modo.setVisible(true);
        //vista_modo.getBotonConfig().doClick();
        //assertTrue(vista_modo.isActive());
    }
    
    
    

    
}
