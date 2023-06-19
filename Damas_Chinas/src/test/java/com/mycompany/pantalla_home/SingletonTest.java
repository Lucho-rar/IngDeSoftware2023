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
public class SingletonTest {
    
    public SingletonTest() {
    }

    
    @Test 
    public void test_visibilidad_inicial(){
        Singleton sg = Singleton.getInstance();
        Assertions.assertTrue(sg.getVisible_home());
    }
    
    @Test
    public void test_musica_inicial(){
        Singleton sg = Singleton.getInstance();
        Assertions.assertTrue(sg.getmusica_inicial());
    }
   
 

    
}
