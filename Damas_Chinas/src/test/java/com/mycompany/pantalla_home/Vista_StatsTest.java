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
public class Vista_StatsTest {
    Singleton_BD singleton_bd = Singleton_BD.getInstance();
    
    public Vista_StatsTest() {
    }
    
    /* Vista inicial */
    @Test
    public void test_inicial(){
        Vista_Stats vs = new Vista_Stats();
        vs.setVisible(true); //Simulo apretarlo desde el home
        assertTrue(vs.getBotonCerrar().isVisible());
        assertTrue(vs.getLabelRanking().isVisible());
        assertTrue(vs.getLabelFirst().isVisible());
        assertTrue(vs.getLabelSecond().isVisible());
        assertTrue(vs.getLabelThird().isVisible()); 
    }
    
    
    /* Test de que esta mostrando bien los usuarios del top en los labels*/
    @Test
    public void test_top(){
        Vista_Stats vs = new Vista_Stats();
        vs.setVisible(true); //Simulo apretarlo desde el home
        assertEquals(vs.getLabelFirst().getText(),singleton_bd.getTOP1().getUsuario());
        assertEquals(vs.getLabelSecond().getText(),singleton_bd.getTOP2().getUsuario());
        assertEquals(vs.getLabelThird().getText(),singleton_bd.getTOP3().getUsuario());
    }
    
    /*Testeo del boton cerrar */
    @Test
    public void test_cerrar(){
        Vista_Stats vs = new Vista_Stats();
        vs.setVisible(true);
        vs.getBotonCerrar().doClick();
        assertFalse(vs.isVisible());
    }
    
    
    
}
