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
public class Vista_SeleccionDificultadTest {
    
    public Vista_SeleccionDificultadTest() {
    }
    
    /*Test inicial */
    @Test
    public void test_inicial(){
        Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        vista_dif.setVisible(true);
        assertTrue(vista_dif.isVisible());
        assertTrue(vista_dif.getBotonBack().isVisible());
        assertTrue(vista_dif.getBotonConfig().isVisible());
        assertTrue(vista_dif.getBotonDificil().isVisible());
        assertTrue(vista_dif.getBotonMedio().isVisible());
        assertTrue(vista_dif.getBotonFacil().isVisible());
    }
    
    /* Test boton facil 
<<<<<<< HEAD:src/test/java/com/mycompany/pantalla_home/Vista_SeleccionDificultadTest.java
    
=======
    @Test
>>>>>>> 4d63b9aa1b55f4dc44a997e7cf10aa2bfc2a90b5:Damas_Chinas/src/test/java/com/mycompany/pantalla_home/Vista_SeleccionDificultadTest.java
    public void test_boton_facil(){
        Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        vista_dif.setVisible(true);
        vista_dif.getBotonFacil().doClick();
        assertFalse(vista_dif.isActive());
    }
    */
    /* Test boton medio */
    @Test 
    public void test_boton_medio(){
        Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        vista_dif.setVisible(true);
        vista_dif.getBotonMedio().doClick();
        assertFalse(vista_dif.isActive());
    }
    
    /* Test boton dificil */
    @Test 
    public void test_boton_dificil(){
        Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        vista_dif.setVisible(true);
        vista_dif.getBotonDificil().doClick();
        assertFalse(vista_dif.isActive());
    }
    
    /* Test boton back */
    @Test 
    public void test_boton_back(){
        Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        vista_dif.setVisible(true);
        vista_dif.getBotonBack().doClick();
        assertFalse(vista_dif.isActive());
    }
    
    /* Test boton config */
    @Test 
    public void test_boton_config(){
        //Vista_SeleccionDificultad vista_dif = new Vista_SeleccionDificultad();
        //vista_dif.setVisible(true);
        //vista_dif.getBotonConfig().doClick();
        //assertTrue(vista_dif.isActive());
    }
    
    
}
