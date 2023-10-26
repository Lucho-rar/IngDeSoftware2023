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
public class Vista_LoginMultijugadorTest {
    
    public Vista_LoginMultijugadorTest() {
    }
    
    /*Test inicial */
    @Test
    
    public void test_inicial(){
        Vista_LoginMultijugador vl= new Vista_LoginMultijugador();
        vl.setVisible(true);
        assertTrue(vl.isVisible());
        assertTrue(vl.getBotonBack().isVisible());
        assertTrue(vl.getBotonIniciar().isVisible());
        assertTrue(vl.getBotonConfig().isVisible());
        assertTrue(vl.getLabelCantidad().isVisible());
        assertTrue(vl.getCombo().isVisible());
    }
    
    /*Test Boton Back 
<<<<<<< HEAD:src/test/java/com/mycompany/pantalla_home/Vista_LoginMultijugadorTest.java
    
=======
    @Test
>>>>>>> 4d63b9aa1b55f4dc44a997e7cf10aa2bfc2a90b5:Damas_Chinas/src/test/java/com/mycompany/pantalla_home/Vista_LoginMultijugadorTest.java
    public void test_boton_back(){
        Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
        vl.setVisible(true);
        vl.getBotonBack().doClick();
        assertFalse(vl.isActive());
    }
    */
    /*Test boton config */
    @Test
    public void test_boton_config(){
        //Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
       // vl.setVisible(true);
       // vl.getBotonConfig().doClick();
       // assertTrue(vl.isActive());
    }
    
    
    
    /*Test de labels por combo para 2*/
    @Test
    public void test_combo(){
        Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
        vl.setVisible(true);
        vl.getCombo().setSelectedIndex(0);
        assertTrue(vl.getUser1().isVisible());
        assertTrue(vl.getUser2().isVisible());
        assertFalse(vl.getUser3().isVisible());
        assertFalse(vl.getUser4().isVisible());
        assertFalse(vl.getUser5().isVisible());
        assertFalse(vl.getUser6().isVisible());
    }
    
    /*Test de labels por combo para 3*/
    @Test
    public void test_combo1(){
        Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
        vl.setVisible(true);
        vl.getCombo().setSelectedIndex(1);
        assertTrue(vl.getUser1().isVisible());
        assertTrue(vl.getUser2().isVisible());
        assertTrue(vl.getUser3().isVisible());
        assertFalse(vl.getUser4().isVisible());
        assertFalse(vl.getUser5().isVisible());
        assertFalse(vl.getUser6().isVisible());
    }
    
    /*Test de labels por combo para 4*/
    @Test
    public void test_combo2(){
        Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
        vl.setVisible(true);
        vl.getCombo().setSelectedIndex(2);
        assertTrue(vl.getUser1().isVisible());
        assertTrue(vl.getUser2().isVisible());
        assertTrue(vl.getUser3().isVisible());
        assertTrue(vl.getUser4().isVisible());
        assertFalse(vl.getUser5().isVisible());
        assertFalse(vl.getUser6().isVisible());
    }
    
    /*Test de labels por combo para 6*/
    @Test
    public void test_combo3(){
        Vista_LoginMultijugador vl = new Vista_LoginMultijugador();
        vl.setVisible(true);
        vl.getCombo().setSelectedIndex(3);
        assertTrue(vl.getUser1().isVisible());
        assertTrue(vl.getUser2().isVisible());
        assertTrue(vl.getUser3().isVisible());
        assertTrue(vl.getUser4().isVisible());
        assertTrue(vl.getUser5().isVisible());
        assertTrue(vl.getUser6().isVisible());
    }
    
}
