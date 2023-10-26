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
public class Vista_ConfigTest {

    Music_Nav m = new Music_Nav();
    Music mod;
    public Vista_ConfigTest() {
        m.performMusic();
    }
    /*
    
    public void test_inicial(){
        
        //m.performMusic()
        Vista_Config vc = new Vista_Config();
        vc.recibirMusica(m);
        vc.setVisible(true); //Apretado desde cualquier pantalla que contenga la conf
        assertTrue(vc.getBotonCerrar().isVisible()); /* Al principio todos los labels estan visibles, solo solapados */
    /*    assertTrue(vc.getBotonSwitch().isVisible());
        assertTrue(vc.getLabelEnabled().isVisible());
        assertTrue(vc.getLabelDisabled().isVisible());
    }
    /*
    
    public void test_mute(){
        Vista_Config vc = new Vista_Config();
        vc.recibirMusica(m);
        vc.setVisible(true); //Apretado desde cualquier pantalla que contenga la conf
        vc.getBotonSwitch().doClick(); /*Si muteo switchea el jlabel de musica */
   /*     assertTrue(vc.getLabelDisabled().isVisible());
        assertFalse(vc.getLabelEnabled().isVisible());
    }
    
    
    public void test_desmute(){
        Vista_Config vc = new Vista_Config();
        vc.recibirMusica(m);
        vc.setVisible(true); //Apretado desde cualquier pantalla que contenga la conf
        vc.getBotonSwitch().doClick(); /*Si muteo switchea el jlabel de musica */
        /* si lo hago dos veces entonces esta prendida la musica*/
    /*    vc.getBotonSwitch().doClick();
        assertFalse(vc.getLabelDisabled().isVisible());
        assertTrue(vc.getLabelEnabled().isVisible());
    }
    */
    /*Cuando apreto el boton cerrar se debe dejar de ver la pantalla config*/
    /*@Test
    public void test_cerrar(){
        Vista_Config vc = new Vista_Config();
        vc.recibirMusica(m);
        vc.setVisible(true); //Apretado desde cualquier pantalla que contenga la conf
        vc.getBotonCerrar().doClick();
        assertFalse(vc.isVisible());
    }
    */
    
}
