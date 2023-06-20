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
public class Vista_LoginIndividualTest {
    
    public Vista_LoginIndividualTest() {
    }
    
    
    /* Verifico la visibilidad de todos los componentes */
    @Test
    
    public void test_inicial(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true); /*Simulo boton de la pantalla anterior*/
        assertTrue(vl.isVisible());
        assertTrue(vl.getBotonBack().isVisible());
        assertTrue(vl.getBotonConfig().isVisible());
        assertTrue(vl.getBotonSubmitLogin().isVisible());
        assertTrue(vl.getBotonSubmitSignup().isVisible());
        assertTrue(vl.getLabelLogin().isVisible());
        assertTrue(vl.getLabelPswLogin().isVisible());
        assertTrue(vl.getLabelPswSignup().isVisible());
        assertTrue(vl.getLabelSignup().isVisible());
        assertTrue(vl.getLabelUserLogin().isVisible());
        assertTrue(vl.getLabelUserSignup().isVisible());
        assertTrue(vl.getFieldPswLogin().isVisible());
        assertTrue(vl.getFieldPswSignUp().isVisible());
        assertTrue(vl.getFieldUserLogin().isVisible());
        assertTrue(vl.getFieldUserSignup().isVisible());
    }
    
    /*Test boton back */
    @Test
    public void test_back(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true);
        vl.getBotonBack().doClick();
        assertFalse(vl.isActive()); //Si no esta activa sus componentes graficos tampoco lo estan
    }
    
    /*Test boton config */
    @Test
    public void test_config(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true);
        vl.getBotonConfig().doClick();
        assertTrue(vl.isActive()); //Para el boton config debe seguir activo   
    }
    
    /* Test para verificar ingreso correcto */
    @Test
    public void test_ingreso(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true);
        vl.getFieldUserLogin().setText("lucho");
        vl.getFieldPswLogin().setText("lucho123");
        vl.getBotonSubmitLogin().doClick();
        assertTrue(vl.getIngresoCorrecto());
    }
    
    /* Test para verificar ingreso incorrecto */
    @Test
    public void test_ingreso_incorrecto(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true);
        vl.getFieldUserLogin().setText("matias");
        vl.getFieldPswLogin().setText("morales");
        vl.getBotonSubmitLogin().doClick();
        assertFalse(vl.getIngresoCorrecto());
    }
    
    
    /* Test para registro incorrecto  (con un usuario repetido)*/ 
    @Test
    public void test_registro_incorrecto(){
        Vista_LoginIndividual vl = new Vista_LoginIndividual();
        vl.setVisible(true);
        vl.getFieldUserSignup().setText("lucho"); //usuario existente
        vl.getFieldPswSignUp().setText("estonofunca");
        vl.getBotonSubmitSignup().doClick();
        assertFalse(vl.getRegistroIncorrecto());
    }
    
   
    
    
    
    
    
    
    
    
    
    
}
